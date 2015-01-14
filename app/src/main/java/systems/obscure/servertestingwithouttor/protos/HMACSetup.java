// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./pond.proto
package systems.obscure.servertestingwithouttor.protos;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Label.REQUIRED;

/**
 * HMACSetup can be sent by a client to establish an HMAC key if it didn't do
 * so at account creation time.
 */
public final class HMACSetup extends Message {

  public static final ByteString DEFAULT_HMAC_KEY = ByteString.EMPTY;

  @ProtoField(tag = 1, type = BYTES, label = REQUIRED)
  public final ByteString hmac_key;

  public HMACSetup(ByteString hmac_key) {
    this.hmac_key = hmac_key;
  }

  private HMACSetup(Builder builder) {
    this(builder.hmac_key);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HMACSetup)) return false;
    return equals(hmac_key, ((HMACSetup) other).hmac_key);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = hmac_key != null ? hmac_key.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<HMACSetup> {

    public ByteString hmac_key;

    public Builder() {
    }

    public Builder(HMACSetup message) {
      super(message);
      if (message == null) return;
      this.hmac_key = message.hmac_key;
    }

    public Builder hmac_key(ByteString hmac_key) {
      this.hmac_key = hmac_key;
      return this;
    }

    @Override
    public HMACSetup build() {
      checkRequiredFields();
      return new HMACSetup(this);
    }
  }
}
