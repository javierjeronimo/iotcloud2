/*
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
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cgl.iotcloud.core.api.thrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class TSensor implements org.apache.thrift.TBase<TSensor, TSensor._Fields>, java.io.Serializable, Cloneable, Comparable<TSensor> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSensor");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CHANNELS_FIELD_DESC = new org.apache.thrift.protocol.TField("channels", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSensorStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSensorTupleSchemeFactory());
  }

  public TSensorId id; // required
  public ByteBuffer metadata; // required
  public List<TChannel> channels; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    METADATA((short)3, "metadata"),
    CHANNELS((short)4, "channels");

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
        case 1: // ID
          return ID;
        case 3: // METADATA
          return METADATA;
        case 4: // CHANNELS
          return CHANNELS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSensorId.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CHANNELS, new org.apache.thrift.meta_data.FieldMetaData("channels", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TChannel.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSensor.class, metaDataMap);
  }

  public TSensor() {
  }

  public TSensor(
    TSensorId id,
    ByteBuffer metadata,
    List<TChannel> channels)
  {
    this();
    this.id = id;
    this.metadata = metadata;
    this.channels = channels;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSensor(TSensor other) {
    if (other.isSetId()) {
      this.id = new TSensorId(other.id);
    }
    if (other.isSetMetadata()) {
      this.metadata = org.apache.thrift.TBaseHelper.copyBinary(other.metadata);
;
    }
    if (other.isSetChannels()) {
      List<TChannel> __this__channels = new ArrayList<TChannel>(other.channels.size());
      for (TChannel other_element : other.channels) {
        __this__channels.add(new TChannel(other_element));
      }
      this.channels = __this__channels;
    }
  }

  public TSensor deepCopy() {
    return new TSensor(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.metadata = null;
    this.channels = null;
  }

  public TSensorId getId() {
    return this.id;
  }

  public TSensor setId(TSensorId id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public byte[] getMetadata() {
    setMetadata(org.apache.thrift.TBaseHelper.rightSize(metadata));
    return metadata == null ? null : metadata.array();
  }

  public ByteBuffer bufferForMetadata() {
    return metadata;
  }

  public TSensor setMetadata(byte[] metadata) {
    setMetadata(metadata == null ? (ByteBuffer)null : ByteBuffer.wrap(metadata));
    return this;
  }

  public TSensor setMetadata(ByteBuffer metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public int getChannelsSize() {
    return (this.channels == null) ? 0 : this.channels.size();
  }

  public java.util.Iterator<TChannel> getChannelsIterator() {
    return (this.channels == null) ? null : this.channels.iterator();
  }

  public void addToChannels(TChannel elem) {
    if (this.channels == null) {
      this.channels = new ArrayList<TChannel>();
    }
    this.channels.add(elem);
  }

  public List<TChannel> getChannels() {
    return this.channels;
  }

  public TSensor setChannels(List<TChannel> channels) {
    this.channels = channels;
    return this;
  }

  public void unsetChannels() {
    this.channels = null;
  }

  /** Returns true if field channels is set (has been assigned a value) and false otherwise */
  public boolean isSetChannels() {
    return this.channels != null;
  }

  public void setChannelsIsSet(boolean value) {
    if (!value) {
      this.channels = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((TSensorId)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((ByteBuffer)value);
      }
      break;

    case CHANNELS:
      if (value == null) {
        unsetChannels();
      } else {
        setChannels((List<TChannel>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case METADATA:
      return getMetadata();

    case CHANNELS:
      return getChannels();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case METADATA:
      return isSetMetadata();
    case CHANNELS:
      return isSetChannels();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSensor)
      return this.equals((TSensor)that);
    return false;
  }

  public boolean equals(TSensor that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_channels = true && this.isSetChannels();
    boolean that_present_channels = true && that.isSetChannels();
    if (this_present_channels || that_present_channels) {
      if (!(this_present_channels && that_present_channels))
        return false;
      if (!this.channels.equals(that.channels))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TSensor other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChannels()).compareTo(other.isSetChannels());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannels()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channels, other.channels);
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
    StringBuilder sb = new StringBuilder("TSensor(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.metadata, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channels:");
    if (this.channels == null) {
      sb.append("null");
    } else {
      sb.append(this.channels);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (id != null) {
      id.validate();
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

  private static class TSensorStandardSchemeFactory implements SchemeFactory {
    public TSensorStandardScheme getScheme() {
      return new TSensorStandardScheme();
    }
  }

  private static class TSensorStandardScheme extends StandardScheme<TSensor> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSensor struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.id = new TSensorId();
              struct.id.read(iprot);
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadata = iprot.readBinary();
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHANNELS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.channels = new ArrayList<TChannel>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  TChannel _elem2;
                  _elem2 = new TChannel();
                  _elem2.read(iprot);
                  struct.channels.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setChannelsIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSensor struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        struct.id.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        oprot.writeBinary(struct.metadata);
        oprot.writeFieldEnd();
      }
      if (struct.channels != null) {
        oprot.writeFieldBegin(CHANNELS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.channels.size()));
          for (TChannel _iter3 : struct.channels)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSensorTupleSchemeFactory implements SchemeFactory {
    public TSensorTupleScheme getScheme() {
      return new TSensorTupleScheme();
    }
  }

  private static class TSensorTupleScheme extends TupleScheme<TSensor> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSensor struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetMetadata()) {
        optionals.set(1);
      }
      if (struct.isSetChannels()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        struct.id.write(oprot);
      }
      if (struct.isSetMetadata()) {
        oprot.writeBinary(struct.metadata);
      }
      if (struct.isSetChannels()) {
        {
          oprot.writeI32(struct.channels.size());
          for (TChannel _iter4 : struct.channels)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSensor struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = new TSensorId();
        struct.id.read(iprot);
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.metadata = iprot.readBinary();
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.channels = new ArrayList<TChannel>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            TChannel _elem7;
            _elem7 = new TChannel();
            _elem7.read(iprot);
            struct.channels.add(_elem7);
          }
        }
        struct.setChannelsIsSet(true);
      }
    }
  }

}
