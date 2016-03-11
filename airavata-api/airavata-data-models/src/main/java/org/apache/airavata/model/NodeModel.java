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
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-11")
public class NodeModel implements org.apache.thrift.TBase<NodeModel, NodeModel._Fields>, java.io.Serializable, Cloneable, Comparable<NodeModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NodeModel");

  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField APPLICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField APPLICATION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NodeModelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NodeModelTupleSchemeFactory());
  }

  private String nodeId; // required
  private String name; // optional
  private String applicationId; // optional
  private String applicationName; // optional
  private ComponentStatus status; // optional
  private String description; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_ID((short)1, "nodeId"),
    NAME((short)2, "name"),
    APPLICATION_ID((short)3, "applicationId"),
    APPLICATION_NAME((short)4, "applicationName"),
    STATUS((short)5, "status"),
    DESCRIPTION((short)6, "description");

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
        case 1: // NODE_ID
          return NODE_ID;
        case 2: // NAME
          return NAME;
        case 3: // APPLICATION_ID
          return APPLICATION_ID;
        case 4: // APPLICATION_NAME
          return APPLICATION_NAME;
        case 5: // STATUS
          return STATUS;
        case 6: // DESCRIPTION
          return DESCRIPTION;
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
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.APPLICATION_ID,_Fields.APPLICATION_NAME,_Fields.STATUS,_Fields.DESCRIPTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("nodeId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("applicationId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLICATION_NAME, new org.apache.thrift.meta_data.FieldMetaData("applicationName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComponentStatus.class)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NodeModel.class, metaDataMap);
  }

  public NodeModel() {
    this.nodeId = "DO_NOT_SET_AT_CLIENTS";

  }

  public NodeModel(
    String nodeId)
  {
    this();
    this.nodeId = nodeId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NodeModel(NodeModel other) {
    if (other.isSetNodeId()) {
      this.nodeId = other.nodeId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetApplicationId()) {
      this.applicationId = other.applicationId;
    }
    if (other.isSetApplicationName()) {
      this.applicationName = other.applicationName;
    }
    if (other.isSetStatus()) {
      this.status = new ComponentStatus(other.status);
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
  }

  public NodeModel deepCopy() {
    return new NodeModel(this);
  }

  @Override
  public void clear() {
    this.nodeId = "DO_NOT_SET_AT_CLIENTS";

    this.name = null;
    this.applicationId = null;
    this.applicationName = null;
    this.status = null;
    this.description = null;
  }

  public String getNodeId() {
    return this.nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public void unsetNodeId() {
    this.nodeId = null;
  }

  /** Returns true if field nodeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeId() {
    return this.nodeId != null;
  }

  public void setNodeIdIsSet(boolean value) {
    if (!value) {
      this.nodeId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getApplicationId() {
    return this.applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public void unsetApplicationId() {
    this.applicationId = null;
  }

  /** Returns true if field applicationId is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationId() {
    return this.applicationId != null;
  }

  public void setApplicationIdIsSet(boolean value) {
    if (!value) {
      this.applicationId = null;
    }
  }

  public String getApplicationName() {
    return this.applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public void unsetApplicationName() {
    this.applicationName = null;
  }

  /** Returns true if field applicationName is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationName() {
    return this.applicationName != null;
  }

  public void setApplicationNameIsSet(boolean value) {
    if (!value) {
      this.applicationName = null;
    }
  }

  public ComponentStatus getStatus() {
    return this.status;
  }

  public void setStatus(ComponentStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_ID:
      if (value == null) {
        unsetNodeId();
      } else {
        setNodeId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case APPLICATION_ID:
      if (value == null) {
        unsetApplicationId();
      } else {
        setApplicationId((String)value);
      }
      break;

    case APPLICATION_NAME:
      if (value == null) {
        unsetApplicationName();
      } else {
        setApplicationName((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((ComponentStatus)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ID:
      return getNodeId();

    case NAME:
      return getName();

    case APPLICATION_ID:
      return getApplicationId();

    case APPLICATION_NAME:
      return getApplicationName();

    case STATUS:
      return getStatus();

    case DESCRIPTION:
      return getDescription();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_ID:
      return isSetNodeId();
    case NAME:
      return isSetName();
    case APPLICATION_ID:
      return isSetApplicationId();
    case APPLICATION_NAME:
      return isSetApplicationName();
    case STATUS:
      return isSetStatus();
    case DESCRIPTION:
      return isSetDescription();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NodeModel)
      return this.equals((NodeModel)that);
    return false;
  }

  public boolean equals(NodeModel that) {
    if (that == null)
      return false;

    boolean this_present_nodeId = true && this.isSetNodeId();
    boolean that_present_nodeId = true && that.isSetNodeId();
    if (this_present_nodeId || that_present_nodeId) {
      if (!(this_present_nodeId && that_present_nodeId))
        return false;
      if (!this.nodeId.equals(that.nodeId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_applicationId = true && this.isSetApplicationId();
    boolean that_present_applicationId = true && that.isSetApplicationId();
    if (this_present_applicationId || that_present_applicationId) {
      if (!(this_present_applicationId && that_present_applicationId))
        return false;
      if (!this.applicationId.equals(that.applicationId))
        return false;
    }

    boolean this_present_applicationName = true && this.isSetApplicationName();
    boolean that_present_applicationName = true && that.isSetApplicationName();
    if (this_present_applicationName || that_present_applicationName) {
      if (!(this_present_applicationName && that_present_applicationName))
        return false;
      if (!this.applicationName.equals(that.applicationName))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodeId = true && (isSetNodeId());
    list.add(present_nodeId);
    if (present_nodeId)
      list.add(nodeId);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_applicationId = true && (isSetApplicationId());
    list.add(present_applicationId);
    if (present_applicationId)
      list.add(applicationId);

    boolean present_applicationName = true && (isSetApplicationName());
    list.add(present_applicationName);
    if (present_applicationName)
      list.add(applicationName);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_description = true && (isSetDescription());
    list.add(present_description);
    if (present_description)
      list.add(description);

    return list.hashCode();
  }

  @Override
  public int compareTo(NodeModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodeId()).compareTo(other.isSetNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeId, other.nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationId()).compareTo(other.isSetApplicationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationId, other.applicationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationName()).compareTo(other.isSetApplicationName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationName, other.applicationName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
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
    StringBuilder sb = new StringBuilder("NodeModel(");
    boolean first = true;

    sb.append("nodeId:");
    if (this.nodeId == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeId);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetApplicationId()) {
      if (!first) sb.append(", ");
      sb.append("applicationId:");
      if (this.applicationId == null) {
        sb.append("null");
      } else {
        sb.append(this.applicationId);
      }
      first = false;
    }
    if (isSetApplicationName()) {
      if (!first) sb.append(", ");
      sb.append("applicationName:");
      if (this.applicationName == null) {
        sb.append("null");
      } else {
        sb.append(this.applicationName);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNodeId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeId' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (status != null) {
      status.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NodeModelStandardSchemeFactory implements SchemeFactory {
    public NodeModelStandardScheme getScheme() {
      return new NodeModelStandardScheme();
    }
  }

  private static class NodeModelStandardScheme extends StandardScheme<NodeModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NodeModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nodeId = iprot.readString();
              struct.setNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLICATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationId = iprot.readString();
              struct.setApplicationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // APPLICATION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationName = iprot.readString();
              struct.setApplicationNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new ComponentStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NodeModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeId != null) {
        oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
        oprot.writeString(struct.nodeId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.applicationId != null) {
        if (struct.isSetApplicationId()) {
          oprot.writeFieldBegin(APPLICATION_ID_FIELD_DESC);
          oprot.writeString(struct.applicationId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.applicationName != null) {
        if (struct.isSetApplicationName()) {
          oprot.writeFieldBegin(APPLICATION_NAME_FIELD_DESC);
          oprot.writeString(struct.applicationName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NodeModelTupleSchemeFactory implements SchemeFactory {
    public NodeModelTupleScheme getScheme() {
      return new NodeModelTupleScheme();
    }
  }

  private static class NodeModelTupleScheme extends TupleScheme<NodeModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NodeModel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.nodeId);
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetApplicationId()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationName()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      if (struct.isSetDescription()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetApplicationId()) {
        oprot.writeString(struct.applicationId);
      }
      if (struct.isSetApplicationName()) {
        oprot.writeString(struct.applicationName);
      }
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NodeModel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.nodeId = iprot.readString();
      struct.setNodeIdIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.applicationId = iprot.readString();
        struct.setApplicationIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationName = iprot.readString();
        struct.setApplicationNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = new ComponentStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
    }
  }

}

