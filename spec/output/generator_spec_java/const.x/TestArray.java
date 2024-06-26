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
 * TestArray's original definition in the XDR file is:
 * <pre>
 * typedef int TestArray[FOO];
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestArray implements XdrElement {
  private Integer[] TestArray;
  public void encode(XdrDataOutputStream stream) throws IOException {
    int TestArraySize = getTestArray().length;
    for (int i = 0; i < TestArraySize; i++) {
      stream.writeInt(TestArray[i]);
    }
  }

  public static TestArray decode(XdrDataInputStream stream) throws IOException {
    TestArray decodedTestArray = new TestArray();
    int TestArraySize = Constants.FOO;
    decodedTestArray.TestArray = new Integer[TestArraySize];
    for (int i = 0; i < TestArraySize; i++) {
      decodedTestArray.TestArray[i] = stream.readInt();
    }
    return decodedTestArray;
  }

  public static TestArray fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static TestArray fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
