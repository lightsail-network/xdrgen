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
 * Int2's original definition in the XDR file is:
 * <pre>
 * typedef hyper           int2;
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Int2 implements XdrElement {
  private Long int2;
  public void encode(XdrDataOutputStream stream) throws IOException {
    stream.writeLong(int2);
  }

  public static Int2 decode(XdrDataInputStream stream) throws IOException {
    Int2 decodedInt2 = new Int2();
    decodedInt2.int2 = stream.readLong();
    return decodedInt2;
  }

  public static Int2 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Int2 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
