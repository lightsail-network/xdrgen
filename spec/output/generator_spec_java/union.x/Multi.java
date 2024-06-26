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

/**
 * Multi's original definition in the XDR file is:
 * <pre>
 * typedef int Multi;
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Multi implements XdrElement {
  private Integer Multi;
  public void encode(XdrDataOutputStream stream) throws IOException {
    stream.writeInt(Multi);
  }

  public static Multi decode(XdrDataInputStream stream) throws IOException {
    Multi decodedMulti = new Multi();
    decodedMulti.Multi = stream.readInt();
    return decodedMulti;
  }

  public static Multi fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Multi fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
