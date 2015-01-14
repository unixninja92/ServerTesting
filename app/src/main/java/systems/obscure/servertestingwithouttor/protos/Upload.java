// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./pond.proto
package systems.obscure.servertestingwithouttor.protos;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.FIXED64;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class Upload extends Message {

  public static final Long DEFAULT_ID = 0L;
  public static final Long DEFAULT_SIZE = 0L;

  @ProtoField(tag = 1, type = FIXED64, label = REQUIRED)
  public final Long id;

  @ProtoField(tag = 2, type = INT64, label = REQUIRED)
  public final Long size;

  public Upload(Long id, Long size) {
    this.id = id;
    this.size = size;
  }

  private Upload(Builder builder) {
    this(builder.id, builder.size);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Upload)) return false;
    Upload o = (Upload) other;
    return equals(id, o.id)
        && equals(size, o.size);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (size != null ? size.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Upload> {

    public Long id;
    public Long size;

    public Builder() {
    }

    public Builder(Upload message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.size = message.size;
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder size(Long size) {
      this.size = size;
      return this;
    }

    @Override
    public Upload build() {
      checkRequiredFields();
      return new Upload(this);
    }
  }
}
