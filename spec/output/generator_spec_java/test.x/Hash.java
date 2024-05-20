// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;

import java.io.IOException;

import org.stellar.sdk.Base64Factory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import static MyXDR.Constants.*;

/**
 * Hash's original definition in the XDR file is:
 * <pre>
 * typedef opaque Hash[32];
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hash implements XdrElement {
  private byte[] Hash;
  public static void encode(XdrDataOutputStream stream, Hash  encodedHash) throws IOException {
    int Hashsize = encodedHash.Hash.length;
    stream.write(encodedHash.getHash(), 0, Hashsize);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Hash decode(XdrDataInputStream stream) throws IOException {
    Hash decodedHash = new Hash();
    int Hashsize = 32;
    decodedHash.Hash = new byte[Hashsize];
    stream.read(decodedHash.Hash, 0, Hashsize);
    return decodedHash;
  }

  @Override
  public String toXdrBase64() throws IOException {
    return Base64Factory.getInstance().encodeToString(toXdrByteArray());
  }

  @Override
  public byte[] toXdrByteArray() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(byteArrayOutputStream);
    encode(xdrDataOutputStream);
    return byteArrayOutputStream.toByteArray();
  }

  public static Hash fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Hash fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
