/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Authenticate using Secured Shell
 * 
 * alternativeSSHHostName:
 *  If the login to ssh is different than the hostname itself, specify it here
 * 
 * sshPort:
 *  If a non-default port needs to used, specify it.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-31")
public class SSHJobSubmission implements org.apache.thrift.TBase<SSHJobSubmission, SSHJobSubmission._Fields>, java.io.Serializable, Cloneable, Comparable<SSHJobSubmission> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SSHJobSubmission");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SECURITY_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("securityProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RESOURCE_JOB_MANAGER_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceJobManager", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ALTERNATIVE_SSHHOST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("alternativeSSHHostName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SSH_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("sshPort", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField MONITOR_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("monitorMode", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SSHJobSubmissionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SSHJobSubmissionTupleSchemeFactory());
  }

  private String jobSubmissionInterfaceId; // required
  private SecurityProtocol securityProtocol; // required
  private ResourceJobManager resourceJobManager; // required
  private String alternativeSSHHostName; // optional
  private int sshPort; // optional
  private MonitorMode monitorMode; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_SUBMISSION_INTERFACE_ID((short)1, "jobSubmissionInterfaceId"),
    /**
     * 
     * @see SecurityProtocol
     */
    SECURITY_PROTOCOL((short)2, "securityProtocol"),
    RESOURCE_JOB_MANAGER((short)3, "resourceJobManager"),
    ALTERNATIVE_SSHHOST_NAME((short)4, "alternativeSSHHostName"),
    SSH_PORT((short)5, "sshPort"),
    /**
     * 
     * @see MonitorMode
     */
    MONITOR_MODE((short)6, "monitorMode");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_SUBMISSION_INTERFACE_ID
          return JOB_SUBMISSION_INTERFACE_ID;
        case 2: // SECURITY_PROTOCOL
          return SECURITY_PROTOCOL;
        case 3: // RESOURCE_JOB_MANAGER
          return RESOURCE_JOB_MANAGER;
        case 4: // ALTERNATIVE_SSHHOST_NAME
          return ALTERNATIVE_SSHHOST_NAME;
        case 5: // SSH_PORT
          return SSH_PORT;
        case 6: // MONITOR_MODE
          return MONITOR_MODE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SSHPORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ALTERNATIVE_SSHHOST_NAME,_Fields.SSH_PORT,_Fields.MONITOR_MODE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_SUBMISSION_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECURITY_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("securityProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SecurityProtocol.class)));
    tmpMap.put(_Fields.RESOURCE_JOB_MANAGER, new org.apache.thrift.meta_data.FieldMetaData("resourceJobManager", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ResourceJobManager.class)));
    tmpMap.put(_Fields.ALTERNATIVE_SSHHOST_NAME, new org.apache.thrift.meta_data.FieldMetaData("alternativeSSHHostName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SSH_PORT, new org.apache.thrift.meta_data.FieldMetaData("sshPort", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MONITOR_MODE, new org.apache.thrift.meta_data.FieldMetaData("monitorMode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MonitorMode.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SSHJobSubmission.class, metaDataMap);
  }

  public SSHJobSubmission() {
    this.jobSubmissionInterfaceId = "DO_NOT_SET_AT_CLIENTS";

    this.sshPort = 22;

  }

  public SSHJobSubmission(
    String jobSubmissionInterfaceId,
    SecurityProtocol securityProtocol,
    ResourceJobManager resourceJobManager)
  {
    this();
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
    this.securityProtocol = securityProtocol;
    this.resourceJobManager = resourceJobManager;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SSHJobSubmission(SSHJobSubmission other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobSubmissionInterfaceId()) {
      this.jobSubmissionInterfaceId = other.jobSubmissionInterfaceId;
    }
    if (other.isSetSecurityProtocol()) {
      this.securityProtocol = other.securityProtocol;
    }
    if (other.isSetResourceJobManager()) {
      this.resourceJobManager = new ResourceJobManager(other.resourceJobManager);
    }
    if (other.isSetAlternativeSSHHostName()) {
      this.alternativeSSHHostName = other.alternativeSSHHostName;
    }
    this.sshPort = other.sshPort;
    if (other.isSetMonitorMode()) {
      this.monitorMode = other.monitorMode;
    }
  }

  public SSHJobSubmission deepCopy() {
    return new SSHJobSubmission(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionInterfaceId = "DO_NOT_SET_AT_CLIENTS";

    this.securityProtocol = null;
    this.resourceJobManager = null;
    this.alternativeSSHHostName = null;
    this.sshPort = 22;

    this.monitorMode = null;
  }

  public String getJobSubmissionInterfaceId() {
    return this.jobSubmissionInterfaceId;
  }

  public void setJobSubmissionInterfaceId(String jobSubmissionInterfaceId) {
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
  }

  public void unsetJobSubmissionInterfaceId() {
    this.jobSubmissionInterfaceId = null;
  }

  /** Returns true if field jobSubmissionInterfaceId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionInterfaceId() {
    return this.jobSubmissionInterfaceId != null;
  }

  public void setJobSubmissionInterfaceIdIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionInterfaceId = null;
    }
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public SecurityProtocol getSecurityProtocol() {
    return this.securityProtocol;
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public void setSecurityProtocol(SecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
  }

  public void unsetSecurityProtocol() {
    this.securityProtocol = null;
  }

  /** Returns true if field securityProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetSecurityProtocol() {
    return this.securityProtocol != null;
  }

  public void setSecurityProtocolIsSet(boolean value) {
    if (!value) {
      this.securityProtocol = null;
    }
  }

  public ResourceJobManager getResourceJobManager() {
    return this.resourceJobManager;
  }

  public void setResourceJobManager(ResourceJobManager resourceJobManager) {
    this.resourceJobManager = resourceJobManager;
  }

  public void unsetResourceJobManager() {
    this.resourceJobManager = null;
  }

  /** Returns true if field resourceJobManager is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceJobManager() {
    return this.resourceJobManager != null;
  }

  public void setResourceJobManagerIsSet(boolean value) {
    if (!value) {
      this.resourceJobManager = null;
    }
  }

  public String getAlternativeSSHHostName() {
    return this.alternativeSSHHostName;
  }

  public void setAlternativeSSHHostName(String alternativeSSHHostName) {
    this.alternativeSSHHostName = alternativeSSHHostName;
  }

  public void unsetAlternativeSSHHostName() {
    this.alternativeSSHHostName = null;
  }

  /** Returns true if field alternativeSSHHostName is set (has been assigned a value) and false otherwise */
  public boolean isSetAlternativeSSHHostName() {
    return this.alternativeSSHHostName != null;
  }

  public void setAlternativeSSHHostNameIsSet(boolean value) {
    if (!value) {
      this.alternativeSSHHostName = null;
    }
  }

  public int getSshPort() {
    return this.sshPort;
  }

  public void setSshPort(int sshPort) {
    this.sshPort = sshPort;
    setSshPortIsSet(true);
  }

  public void unsetSshPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SSHPORT_ISSET_ID);
  }

  /** Returns true if field sshPort is set (has been assigned a value) and false otherwise */
  public boolean isSetSshPort() {
    return EncodingUtils.testBit(__isset_bitfield, __SSHPORT_ISSET_ID);
  }

  public void setSshPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SSHPORT_ISSET_ID, value);
  }

  /**
   * 
   * @see MonitorMode
   */
  public MonitorMode getMonitorMode() {
    return this.monitorMode;
  }

  /**
   * 
   * @see MonitorMode
   */
  public void setMonitorMode(MonitorMode monitorMode) {
    this.monitorMode = monitorMode;
  }

  public void unsetMonitorMode() {
    this.monitorMode = null;
  }

  /** Returns true if field monitorMode is set (has been assigned a value) and false otherwise */
  public boolean isSetMonitorMode() {
    return this.monitorMode != null;
  }

  public void setMonitorModeIsSet(boolean value) {
    if (!value) {
      this.monitorMode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      if (value == null) {
        unsetJobSubmissionInterfaceId();
      } else {
        setJobSubmissionInterfaceId((String)value);
      }
      break;

    case SECURITY_PROTOCOL:
      if (value == null) {
        unsetSecurityProtocol();
      } else {
        setSecurityProtocol((SecurityProtocol)value);
      }
      break;

    case RESOURCE_JOB_MANAGER:
      if (value == null) {
        unsetResourceJobManager();
      } else {
        setResourceJobManager((ResourceJobManager)value);
      }
      break;

    case ALTERNATIVE_SSHHOST_NAME:
      if (value == null) {
        unsetAlternativeSSHHostName();
      } else {
        setAlternativeSSHHostName((String)value);
      }
      break;

    case SSH_PORT:
      if (value == null) {
        unsetSshPort();
      } else {
        setSshPort((Integer)value);
      }
      break;

    case MONITOR_MODE:
      if (value == null) {
        unsetMonitorMode();
      } else {
        setMonitorMode((MonitorMode)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return getJobSubmissionInterfaceId();

    case SECURITY_PROTOCOL:
      return getSecurityProtocol();

    case RESOURCE_JOB_MANAGER:
      return getResourceJobManager();

    case ALTERNATIVE_SSHHOST_NAME:
      return getAlternativeSSHHostName();

    case SSH_PORT:
      return Integer.valueOf(getSshPort());

    case MONITOR_MODE:
      return getMonitorMode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return isSetJobSubmissionInterfaceId();
    case SECURITY_PROTOCOL:
      return isSetSecurityProtocol();
    case RESOURCE_JOB_MANAGER:
      return isSetResourceJobManager();
    case ALTERNATIVE_SSHHOST_NAME:
      return isSetAlternativeSSHHostName();
    case SSH_PORT:
      return isSetSshPort();
    case MONITOR_MODE:
      return isSetMonitorMode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SSHJobSubmission)
      return this.equals((SSHJobSubmission)that);
    return false;
  }

  public boolean equals(SSHJobSubmission that) {
    if (that == null)
      return false;

    boolean this_present_jobSubmissionInterfaceId = true && this.isSetJobSubmissionInterfaceId();
    boolean that_present_jobSubmissionInterfaceId = true && that.isSetJobSubmissionInterfaceId();
    if (this_present_jobSubmissionInterfaceId || that_present_jobSubmissionInterfaceId) {
      if (!(this_present_jobSubmissionInterfaceId && that_present_jobSubmissionInterfaceId))
        return false;
      if (!this.jobSubmissionInterfaceId.equals(that.jobSubmissionInterfaceId))
        return false;
    }

    boolean this_present_securityProtocol = true && this.isSetSecurityProtocol();
    boolean that_present_securityProtocol = true && that.isSetSecurityProtocol();
    if (this_present_securityProtocol || that_present_securityProtocol) {
      if (!(this_present_securityProtocol && that_present_securityProtocol))
        return false;
      if (!this.securityProtocol.equals(that.securityProtocol))
        return false;
    }

    boolean this_present_resourceJobManager = true && this.isSetResourceJobManager();
    boolean that_present_resourceJobManager = true && that.isSetResourceJobManager();
    if (this_present_resourceJobManager || that_present_resourceJobManager) {
      if (!(this_present_resourceJobManager && that_present_resourceJobManager))
        return false;
      if (!this.resourceJobManager.equals(that.resourceJobManager))
        return false;
    }

    boolean this_present_alternativeSSHHostName = true && this.isSetAlternativeSSHHostName();
    boolean that_present_alternativeSSHHostName = true && that.isSetAlternativeSSHHostName();
    if (this_present_alternativeSSHHostName || that_present_alternativeSSHHostName) {
      if (!(this_present_alternativeSSHHostName && that_present_alternativeSSHHostName))
        return false;
      if (!this.alternativeSSHHostName.equals(that.alternativeSSHHostName))
        return false;
    }

    boolean this_present_sshPort = true && this.isSetSshPort();
    boolean that_present_sshPort = true && that.isSetSshPort();
    if (this_present_sshPort || that_present_sshPort) {
      if (!(this_present_sshPort && that_present_sshPort))
        return false;
      if (this.sshPort != that.sshPort)
        return false;
    }

    boolean this_present_monitorMode = true && this.isSetMonitorMode();
    boolean that_present_monitorMode = true && that.isSetMonitorMode();
    if (this_present_monitorMode || that_present_monitorMode) {
      if (!(this_present_monitorMode && that_present_monitorMode))
        return false;
      if (!this.monitorMode.equals(that.monitorMode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobSubmissionInterfaceId = true && (isSetJobSubmissionInterfaceId());
    list.add(present_jobSubmissionInterfaceId);
    if (present_jobSubmissionInterfaceId)
      list.add(jobSubmissionInterfaceId);

    boolean present_securityProtocol = true && (isSetSecurityProtocol());
    list.add(present_securityProtocol);
    if (present_securityProtocol)
      list.add(securityProtocol.getValue());

    boolean present_resourceJobManager = true && (isSetResourceJobManager());
    list.add(present_resourceJobManager);
    if (present_resourceJobManager)
      list.add(resourceJobManager);

    boolean present_alternativeSSHHostName = true && (isSetAlternativeSSHHostName());
    list.add(present_alternativeSSHHostName);
    if (present_alternativeSSHHostName)
      list.add(alternativeSSHHostName);

    boolean present_sshPort = true && (isSetSshPort());
    list.add(present_sshPort);
    if (present_sshPort)
      list.add(sshPort);

    boolean present_monitorMode = true && (isSetMonitorMode());
    list.add(present_monitorMode);
    if (present_monitorMode)
      list.add(monitorMode.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(SSHJobSubmission other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobSubmissionInterfaceId()).compareTo(other.isSetJobSubmissionInterfaceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionInterfaceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionInterfaceId, other.jobSubmissionInterfaceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecurityProtocol()).compareTo(other.isSetSecurityProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecurityProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.securityProtocol, other.securityProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceJobManager()).compareTo(other.isSetResourceJobManager());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceJobManager()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceJobManager, other.resourceJobManager);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlternativeSSHHostName()).compareTo(other.isSetAlternativeSSHHostName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlternativeSSHHostName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alternativeSSHHostName, other.alternativeSSHHostName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSshPort()).compareTo(other.isSetSshPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSshPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sshPort, other.sshPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMonitorMode()).compareTo(other.isSetMonitorMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonitorMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.monitorMode, other.monitorMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SSHJobSubmission(");
    boolean first = true;

    sb.append("jobSubmissionInterfaceId:");
    if (this.jobSubmissionInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionInterfaceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("securityProtocol:");
    if (this.securityProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.securityProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resourceJobManager:");
    if (this.resourceJobManager == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceJobManager);
    }
    first = false;
    if (isSetAlternativeSSHHostName()) {
      if (!first) sb.append(", ");
      sb.append("alternativeSSHHostName:");
      if (this.alternativeSSHHostName == null) {
        sb.append("null");
      } else {
        sb.append(this.alternativeSSHHostName);
      }
      first = false;
    }
    if (isSetSshPort()) {
      if (!first) sb.append(", ");
      sb.append("sshPort:");
      sb.append(this.sshPort);
      first = false;
    }
    if (isSetMonitorMode()) {
      if (!first) sb.append(", ");
      sb.append("monitorMode:");
      if (this.monitorMode == null) {
        sb.append("null");
      } else {
        sb.append(this.monitorMode);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionInterfaceId' is unset! Struct:" + toString());
    }

    if (!isSetSecurityProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'securityProtocol' is unset! Struct:" + toString());
    }

    if (!isSetResourceJobManager()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceJobManager' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (resourceJobManager != null) {
      resourceJobManager.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SSHJobSubmissionStandardSchemeFactory implements SchemeFactory {
    public SSHJobSubmissionStandardScheme getScheme() {
      return new SSHJobSubmissionStandardScheme();
    }
  }

  private static class SSHJobSubmissionStandardScheme extends StandardScheme<SSHJobSubmission> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_SUBMISSION_INTERFACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobSubmissionInterfaceId = iprot.readString();
              struct.setJobSubmissionInterfaceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECURITY_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.securityProtocol = org.apache.airavata.model.appcatalog.computeresource.SecurityProtocol.findByValue(iprot.readI32());
              struct.setSecurityProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESOURCE_JOB_MANAGER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resourceJobManager = new ResourceJobManager();
              struct.resourceJobManager.read(iprot);
              struct.setResourceJobManagerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ALTERNATIVE_SSHHOST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.alternativeSSHHostName = iprot.readString();
              struct.setAlternativeSSHHostNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SSH_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sshPort = iprot.readI32();
              struct.setSshPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MONITOR_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.monitorMode = org.apache.airavata.model.appcatalog.computeresource.MonitorMode.findByValue(iprot.readI32());
              struct.setMonitorModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionInterfaceId != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.jobSubmissionInterfaceId);
        oprot.writeFieldEnd();
      }
      if (struct.securityProtocol != null) {
        oprot.writeFieldBegin(SECURITY_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.securityProtocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.resourceJobManager != null) {
        oprot.writeFieldBegin(RESOURCE_JOB_MANAGER_FIELD_DESC);
        struct.resourceJobManager.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.alternativeSSHHostName != null) {
        if (struct.isSetAlternativeSSHHostName()) {
          oprot.writeFieldBegin(ALTERNATIVE_SSHHOST_NAME_FIELD_DESC);
          oprot.writeString(struct.alternativeSSHHostName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSshPort()) {
        oprot.writeFieldBegin(SSH_PORT_FIELD_DESC);
        oprot.writeI32(struct.sshPort);
        oprot.writeFieldEnd();
      }
      if (struct.monitorMode != null) {
        if (struct.isSetMonitorMode()) {
          oprot.writeFieldBegin(MONITOR_MODE_FIELD_DESC);
          oprot.writeI32(struct.monitorMode.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SSHJobSubmissionTupleSchemeFactory implements SchemeFactory {
    public SSHJobSubmissionTupleScheme getScheme() {
      return new SSHJobSubmissionTupleScheme();
    }
  }

  private static class SSHJobSubmissionTupleScheme extends TupleScheme<SSHJobSubmission> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobSubmissionInterfaceId);
      oprot.writeI32(struct.securityProtocol.getValue());
      struct.resourceJobManager.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetAlternativeSSHHostName()) {
        optionals.set(0);
      }
      if (struct.isSetSshPort()) {
        optionals.set(1);
      }
      if (struct.isSetMonitorMode()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAlternativeSSHHostName()) {
        oprot.writeString(struct.alternativeSSHHostName);
      }
      if (struct.isSetSshPort()) {
        oprot.writeI32(struct.sshPort);
      }
      if (struct.isSetMonitorMode()) {
        oprot.writeI32(struct.monitorMode.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobSubmissionInterfaceId = iprot.readString();
      struct.setJobSubmissionInterfaceIdIsSet(true);
      struct.securityProtocol = org.apache.airavata.model.appcatalog.computeresource.SecurityProtocol.findByValue(iprot.readI32());
      struct.setSecurityProtocolIsSet(true);
      struct.resourceJobManager = new ResourceJobManager();
      struct.resourceJobManager.read(iprot);
      struct.setResourceJobManagerIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.alternativeSSHHostName = iprot.readString();
        struct.setAlternativeSSHHostNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sshPort = iprot.readI32();
        struct.setSshPortIsSet(true);
      }
      if (incoming.get(2)) {
        struct.monitorMode = org.apache.airavata.model.appcatalog.computeresource.MonitorMode.findByValue(iprot.readI32());
        struct.setMonitorModeIsSet(true);
      }
    }
  }

}

