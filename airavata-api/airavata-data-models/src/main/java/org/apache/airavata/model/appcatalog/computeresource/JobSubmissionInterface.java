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
 * Job Submission Interfaces
 * 
 * jobSubmissionInterfaceId: The Job Submission Interface has to be previously registered and referenced here.
 * 
 * priorityOrder:
 *  For resources with multiple interfaces, the priority order should be selected.
 *   Lower the numerical number, higher the priority
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-31")
public class JobSubmissionInterface implements org.apache.thrift.TBase<JobSubmissionInterface, JobSubmissionInterface._Fields>, java.io.Serializable, Cloneable, Comparable<JobSubmissionInterface> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobSubmissionInterface");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRIORITY_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("priorityOrder", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobSubmissionInterfaceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobSubmissionInterfaceTupleSchemeFactory());
  }

  private String jobSubmissionInterfaceId; // required
  private JobSubmissionProtocol jobSubmissionProtocol; // required
  private int priorityOrder; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_SUBMISSION_INTERFACE_ID((short)1, "jobSubmissionInterfaceId"),
    /**
     * 
     * @see JobSubmissionProtocol
     */
    JOB_SUBMISSION_PROTOCOL((short)2, "jobSubmissionProtocol"),
    PRIORITY_ORDER((short)3, "priorityOrder");

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
        case 2: // JOB_SUBMISSION_PROTOCOL
          return JOB_SUBMISSION_PROTOCOL;
        case 3: // PRIORITY_ORDER
          return PRIORITY_ORDER;
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
  private static final int __PRIORITYORDER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_SUBMISSION_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_SUBMISSION_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobSubmissionProtocol.class)));
    tmpMap.put(_Fields.PRIORITY_ORDER, new org.apache.thrift.meta_data.FieldMetaData("priorityOrder", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobSubmissionInterface.class, metaDataMap);
  }

  public JobSubmissionInterface() {
    this.priorityOrder = 0;

  }

  public JobSubmissionInterface(
    String jobSubmissionInterfaceId,
    JobSubmissionProtocol jobSubmissionProtocol,
    int priorityOrder)
  {
    this();
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
    this.jobSubmissionProtocol = jobSubmissionProtocol;
    this.priorityOrder = priorityOrder;
    setPriorityOrderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobSubmissionInterface(JobSubmissionInterface other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobSubmissionInterfaceId()) {
      this.jobSubmissionInterfaceId = other.jobSubmissionInterfaceId;
    }
    if (other.isSetJobSubmissionProtocol()) {
      this.jobSubmissionProtocol = other.jobSubmissionProtocol;
    }
    this.priorityOrder = other.priorityOrder;
  }

  public JobSubmissionInterface deepCopy() {
    return new JobSubmissionInterface(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionInterfaceId = null;
    this.jobSubmissionProtocol = null;
    this.priorityOrder = 0;

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
   * @see JobSubmissionProtocol
   */
  public JobSubmissionProtocol getJobSubmissionProtocol() {
    return this.jobSubmissionProtocol;
  }

  /**
   * 
   * @see JobSubmissionProtocol
   */
  public void setJobSubmissionProtocol(JobSubmissionProtocol jobSubmissionProtocol) {
    this.jobSubmissionProtocol = jobSubmissionProtocol;
  }

  public void unsetJobSubmissionProtocol() {
    this.jobSubmissionProtocol = null;
  }

  /** Returns true if field jobSubmissionProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionProtocol() {
    return this.jobSubmissionProtocol != null;
  }

  public void setJobSubmissionProtocolIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionProtocol = null;
    }
  }

  public int getPriorityOrder() {
    return this.priorityOrder;
  }

  public void setPriorityOrder(int priorityOrder) {
    this.priorityOrder = priorityOrder;
    setPriorityOrderIsSet(true);
  }

  public void unsetPriorityOrder() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRIORITYORDER_ISSET_ID);
  }

  /** Returns true if field priorityOrder is set (has been assigned a value) and false otherwise */
  public boolean isSetPriorityOrder() {
    return EncodingUtils.testBit(__isset_bitfield, __PRIORITYORDER_ISSET_ID);
  }

  public void setPriorityOrderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRIORITYORDER_ISSET_ID, value);
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

    case JOB_SUBMISSION_PROTOCOL:
      if (value == null) {
        unsetJobSubmissionProtocol();
      } else {
        setJobSubmissionProtocol((JobSubmissionProtocol)value);
      }
      break;

    case PRIORITY_ORDER:
      if (value == null) {
        unsetPriorityOrder();
      } else {
        setPriorityOrder((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return getJobSubmissionInterfaceId();

    case JOB_SUBMISSION_PROTOCOL:
      return getJobSubmissionProtocol();

    case PRIORITY_ORDER:
      return Integer.valueOf(getPriorityOrder());

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
    case JOB_SUBMISSION_PROTOCOL:
      return isSetJobSubmissionProtocol();
    case PRIORITY_ORDER:
      return isSetPriorityOrder();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobSubmissionInterface)
      return this.equals((JobSubmissionInterface)that);
    return false;
  }

  public boolean equals(JobSubmissionInterface that) {
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

    boolean this_present_jobSubmissionProtocol = true && this.isSetJobSubmissionProtocol();
    boolean that_present_jobSubmissionProtocol = true && that.isSetJobSubmissionProtocol();
    if (this_present_jobSubmissionProtocol || that_present_jobSubmissionProtocol) {
      if (!(this_present_jobSubmissionProtocol && that_present_jobSubmissionProtocol))
        return false;
      if (!this.jobSubmissionProtocol.equals(that.jobSubmissionProtocol))
        return false;
    }

    boolean this_present_priorityOrder = true;
    boolean that_present_priorityOrder = true;
    if (this_present_priorityOrder || that_present_priorityOrder) {
      if (!(this_present_priorityOrder && that_present_priorityOrder))
        return false;
      if (this.priorityOrder != that.priorityOrder)
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

    boolean present_jobSubmissionProtocol = true && (isSetJobSubmissionProtocol());
    list.add(present_jobSubmissionProtocol);
    if (present_jobSubmissionProtocol)
      list.add(jobSubmissionProtocol.getValue());

    boolean present_priorityOrder = true;
    list.add(present_priorityOrder);
    if (present_priorityOrder)
      list.add(priorityOrder);

    return list.hashCode();
  }

  @Override
  public int compareTo(JobSubmissionInterface other) {
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
    lastComparison = Boolean.valueOf(isSetJobSubmissionProtocol()).compareTo(other.isSetJobSubmissionProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionProtocol, other.jobSubmissionProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriorityOrder()).compareTo(other.isSetPriorityOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriorityOrder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priorityOrder, other.priorityOrder);
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
    StringBuilder sb = new StringBuilder("JobSubmissionInterface(");
    boolean first = true;

    sb.append("jobSubmissionInterfaceId:");
    if (this.jobSubmissionInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionInterfaceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobSubmissionProtocol:");
    if (this.jobSubmissionProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("priorityOrder:");
    sb.append(this.priorityOrder);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionInterfaceId' is unset! Struct:" + toString());
    }

    if (!isSetJobSubmissionProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionProtocol' is unset! Struct:" + toString());
    }

    if (!isSetPriorityOrder()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'priorityOrder' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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

  private static class JobSubmissionInterfaceStandardSchemeFactory implements SchemeFactory {
    public JobSubmissionInterfaceStandardScheme getScheme() {
      return new JobSubmissionInterfaceStandardScheme();
    }
  }

  private static class JobSubmissionInterfaceStandardScheme extends StandardScheme<JobSubmissionInterface> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobSubmissionInterface struct) throws org.apache.thrift.TException {
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
          case 2: // JOB_SUBMISSION_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobSubmissionProtocol = org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol.findByValue(iprot.readI32());
              struct.setJobSubmissionProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRIORITY_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priorityOrder = iprot.readI32();
              struct.setPriorityOrderIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobSubmissionInterface struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionInterfaceId != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.jobSubmissionInterfaceId);
        oprot.writeFieldEnd();
      }
      if (struct.jobSubmissionProtocol != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.jobSubmissionProtocol.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRIORITY_ORDER_FIELD_DESC);
      oprot.writeI32(struct.priorityOrder);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobSubmissionInterfaceTupleSchemeFactory implements SchemeFactory {
    public JobSubmissionInterfaceTupleScheme getScheme() {
      return new JobSubmissionInterfaceTupleScheme();
    }
  }

  private static class JobSubmissionInterfaceTupleScheme extends TupleScheme<JobSubmissionInterface> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobSubmissionInterface struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobSubmissionInterfaceId);
      oprot.writeI32(struct.jobSubmissionProtocol.getValue());
      oprot.writeI32(struct.priorityOrder);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobSubmissionInterface struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobSubmissionInterfaceId = iprot.readString();
      struct.setJobSubmissionInterfaceIdIsSet(true);
      struct.jobSubmissionProtocol = org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol.findByValue(iprot.readI32());
      struct.setJobSubmissionProtocolIsSet(true);
      struct.priorityOrder = iprot.readI32();
      struct.setPriorityOrderIsSet(true);
    }
  }

}

