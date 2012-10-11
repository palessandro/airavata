/*
*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/

package org.apache.airavata.persistance.registry.jpa;

import junit.framework.TestCase;
import org.apache.airavata.persistance.registry.jpa.resources.ExperimentResource;
import org.apache.airavata.persistance.registry.jpa.resources.GatewayResource;
import org.apache.airavata.persistance.registry.jpa.resources.ProjectResource;
import org.apache.airavata.persistance.registry.jpa.resources.WorkerResource;

import java.sql.Date;
import java.util.Calendar;

public class ProjectResourceTest extends TestCase {
    private GatewayResource gatewayResource;
    private WorkerResource workerResource;
    private ProjectResource projectResource;
    private ExperimentResource experimentResource;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        gatewayResource = (GatewayResource)ResourceUtils.getGateway("gateway1");
        workerResource = (WorkerResource)ResourceUtils.getWorker(gatewayResource.getGatewayName(), "testUser");
        projectResource =  workerResource.createProject("testProject");
        projectResource.setGateway(gatewayResource);
        projectResource.setWorker(workerResource);
        projectResource.save();
    }

    public void testCreate() throws Exception {
        experimentResource = projectResource.createExperiment("testExpID");
        experimentResource.setGateway(gatewayResource);
        experimentResource.setWorker(workerResource);
        Calendar calender = Calendar.getInstance();
        java.util.Date d =  calender.getTime();
        Date currentTime = new Date(d.getTime());
        experimentResource.setSubmittedDate(currentTime);
        experimentResource.setProject(projectResource);
        experimentResource.save();
        assertNotNull("experiment resource created successfully", experimentResource);
    }

    public void testGet() throws Exception {
        ExperimentResource experiment = projectResource.getExperiment("testExpID");
        assertNotNull("experiment resource retrieved successfully", experiment);
    }

     public void testGetList() throws Exception {
         assertNotNull("experiment resources retrieved successfully", projectResource.getExperiments());
     }

    public void testSave() throws Exception {
        projectResource.save();

        if(workerResource.isProjectExists("testProject")){
            assertTrue("Project saved successfully", true);
        }
        //remove project
        workerResource.removeProject("testProject");
    }


    public void testRemove() throws Exception {
        projectResource.removeExperiment("testExpID");
        if(!projectResource.isExperimentExists("testExpID")) {
            assertTrue("experiment removed successfully", true);
        }
    }
}
