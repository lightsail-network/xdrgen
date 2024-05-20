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
 * Arr's original definition in the XDR file is:
 * <pre>
 * typedef int Arr[2];
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Arr implements XdrElement {
  private Integer[] Arr;
  public static void encode(XdrDataOutputStream stream, Arr  encodedArr) throws IOException {
    int Arrsize = encodedArr.getArr().length;
    for (int i = 0; i < Arrsize; i++) {
      stream.writeInt(encodedArr.Arr[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Arr decode(XdrDataInputStream stream) throws IOException {
    Arr decodedArr = new Arr();
    int Arrsize = 2;
    decodedArr.Arr = new Integer[Arrsize];
    for (int i = 0; i < Arrsize; i++) {
      decodedArr.Arr[i] = stream.readInt();
    }
    return decodedArr;
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

  public static Arr fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Arr fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
