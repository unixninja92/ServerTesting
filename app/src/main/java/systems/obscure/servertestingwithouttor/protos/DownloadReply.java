// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./pond.proto
package systems.obscure.servertestingwithouttor.protos;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class DownloadReply extends Message {

  public static final Long DEFAULT_SIZE = 0L;

  @ProtoField(tag = 1, type = INT64, label = REQUIRED)
  public final Long size;

  public DownloadReply(Long size) {
    this.size = size;
  }

  private DownloadReply(Builder builder) {
    this(builder.size);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DownloadReply)) return false;
    return equals(size, ((DownloadReply) other).size);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = size != null ? size.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<DownloadReply> {

    public Long size;

    public Builder() {
    }

    public Builder(DownloadReply message) {
      super(message);
      if (message == null) return;
      this.size = message.size;
    }

    public Builder size(Long size) {
      this.size = size;
      return this;
    }

    @Override
    public DownloadReply build() {
      checkRequiredFields();
      return new DownloadReply(this);
    }
  }
}
