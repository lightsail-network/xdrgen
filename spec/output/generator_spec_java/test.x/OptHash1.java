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
 * OptHash1's original definition in the XDR file is:
 * <pre>
 * typedef Hash &#42;optHash1;
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptHash1 implements XdrElement {
  private Hash optHash1;
  public void encode(XdrDataOutputStream stream) throws IOException {
    if (optHash1 != null) {
    stream.writeInt(1);
    optHash1.encode(stream);
    } else {
    stream.writeInt(0);
    }
  }

  public static OptHash1 decode(XdrDataInputStream stream) throws IOException {
    OptHash1 decodedOptHash1 = new OptHash1();
    int optHash1Present = stream.readInt();
    if (optHash1Present != 0) {
    decodedOptHash1.optHash1 = Hash.decode(stream);
    }
    return decodedOptHash1;
  }

  public static OptHash1 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static OptHash1 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
