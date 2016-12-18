/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.team.omni.weather.aurora.client.sdk;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class ConfigSummaryResult implements org.apache.thrift.TBase<ConfigSummaryResult, ConfigSummaryResult._Fields>, java.io.Serializable, Cloneable, Comparable<ConfigSummaryResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConfigSummaryResult");

  private static final org.apache.thrift.protocol.TField SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("summary", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConfigSummaryResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConfigSummaryResultTupleSchemeFactory());
  }

  public ConfigSummary summary; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUMMARY((short)1, "summary");

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
        case 1: // SUMMARY
          return SUMMARY;
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
    tmpMap.put(_Fields.SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("summary", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ConfigSummary.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConfigSummaryResult.class, metaDataMap);
  }

  public ConfigSummaryResult() {
  }

  public ConfigSummaryResult(
    ConfigSummary summary)
  {
    this();
    this.summary = summary;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConfigSummaryResult(ConfigSummaryResult other) {
    if (other.isSetSummary()) {
      this.summary = new ConfigSummary(other.summary);
    }
  }

  public ConfigSummaryResult deepCopy() {
    return new ConfigSummaryResult(this);
  }

  @Override
  public void clear() {
    this.summary = null;
  }

  public ConfigSummary getSummary() {
    return this.summary;
  }

  public ConfigSummaryResult setSummary(ConfigSummary summary) {
    this.summary = summary;
    return this;
  }

  public void unsetSummary() {
    this.summary = null;
  }

  /** Returns true if field summary is set (has been assigned a value) and false otherwise */
  public boolean isSetSummary() {
    return this.summary != null;
  }

  public void setSummaryIsSet(boolean value) {
    if (!value) {
      this.summary = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUMMARY:
      if (value == null) {
        unsetSummary();
      } else {
        setSummary((ConfigSummary)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUMMARY:
      return getSummary();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUMMARY:
      return isSetSummary();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConfigSummaryResult)
      return this.equals((ConfigSummaryResult)that);
    return false;
  }

  public boolean equals(ConfigSummaryResult that) {
    if (that == null)
      return false;

    boolean this_present_summary = true && this.isSetSummary();
    boolean that_present_summary = true && that.isSetSummary();
    if (this_present_summary || that_present_summary) {
      if (!(this_present_summary && that_present_summary))
        return false;
      if (!this.summary.equals(that.summary))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_summary = true && (isSetSummary());
    list.add(present_summary);
    if (present_summary)
      list.add(summary);

    return list.hashCode();
  }

  @Override
  public int compareTo(ConfigSummaryResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSummary()).compareTo(other.isSetSummary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSummary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.summary, other.summary);
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
    StringBuilder sb = new StringBuilder("ConfigSummaryResult(");
    boolean first = true;

    sb.append("summary:");
    if (this.summary == null) {
      sb.append("null");
    } else {
      sb.append(this.summary);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (summary != null) {
      summary.validate();
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

  private static class ConfigSummaryResultStandardSchemeFactory implements SchemeFactory {
    public ConfigSummaryResultStandardScheme getScheme() {
      return new ConfigSummaryResultStandardScheme();
    }
  }

  private static class ConfigSummaryResultStandardScheme extends StandardScheme<ConfigSummaryResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConfigSummaryResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.summary = new ConfigSummary();
              struct.summary.read(iprot);
              struct.setSummaryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConfigSummaryResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.summary != null) {
        oprot.writeFieldBegin(SUMMARY_FIELD_DESC);
        struct.summary.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConfigSummaryResultTupleSchemeFactory implements SchemeFactory {
    public ConfigSummaryResultTupleScheme getScheme() {
      return new ConfigSummaryResultTupleScheme();
    }
  }

  private static class ConfigSummaryResultTupleScheme extends TupleScheme<ConfigSummaryResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConfigSummaryResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSummary()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSummary()) {
        struct.summary.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConfigSummaryResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.summary = new ConfigSummary();
        struct.summary.read(iprot);
        struct.setSummaryIsSet(true);
      }
    }
  }

}

