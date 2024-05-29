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
 * Hashes1's original definition in the XDR file is:
 * <pre>
 * typedef Hash Hashes1[12];
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hashes1 implements XdrElement {
  private Hash[] Hashes1;
  public void encode(XdrDataOutputStream stream) throws IOException {
    int Hashes1Size = getHashes1().length;
    for (int i = 0; i < Hashes1Size; i++) {
      Hashes1[i].encode(stream);
    }
  }

  public static Hashes1 decode(XdrDataInputStream stream) throws IOException {
    Hashes1 decodedHashes1 = new Hashes1();
    int Hashes1Size = 12;
    decodedHashes1.Hashes1 = new Hash[Hashes1Size];
    for (int i = 0; i < Hashes1Size; i++) {
      decodedHashes1.Hashes1[i] = Hash.decode(stream);
    }
    return decodedHashes1;
  }

  public static Hashes1 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Hashes1 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
