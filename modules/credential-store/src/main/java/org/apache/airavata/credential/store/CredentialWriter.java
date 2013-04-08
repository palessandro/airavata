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

package org.apache.airavata.credential.store;

/**
 * The entity who's writing credentials to DB will use this interface.
 */
public interface CredentialWriter {

    /**
     * Writes given credentials to a persistent storage.
     * @param credential The credentials implementation.
     */
    void writeCredentials(Credential credential) throws CredentialStoreException;

    /**
     * Writes community user information.
     * @param communityUser Writes community user information to a persistent storage.
     * @throws CredentialStoreException If an error occurred while writing community user.
     */
    void writeCommunityUser(CommunityUser communityUser) throws CredentialStoreException;
}
