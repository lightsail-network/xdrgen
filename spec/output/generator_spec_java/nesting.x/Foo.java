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
 * Foo's original definition in the XDR file is:
 * <pre>
 * typedef int Foo;
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foo implements XdrElement {
  private Integer Foo;
  public void encode(XdrDataOutputStream stream) throws IOException {
    stream.writeInt(Foo);
  }

  public static Foo decode(XdrDataInputStream stream) throws IOException {
    Foo decodedFoo = new Foo();
    decodedFoo.Foo = stream.readInt();
    return decodedFoo;
  }

  public static Foo fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Foo fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
