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
 * TestArray2's original definition in the XDR file is:
 * <pre>
 * typedef int TestArray2&lt;FOO&gt;;
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestArray2 implements XdrElement {
  private Integer[] TestArray2;
  public static void encode(XdrDataOutputStream stream, TestArray2  encodedTestArray2) throws IOException {
    int TestArray2Size = encodedTestArray2.getTestArray2().length;
    stream.writeInt(TestArray2Size);
    for (int i = 0; i < TestArray2Size; i++) {
      stream.writeInt(encodedTestArray2.TestArray2[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static TestArray2 decode(XdrDataInputStream stream) throws IOException {
    TestArray2 decodedTestArray2 = new TestArray2();
    int TestArray2Size = stream.readInt();
    decodedTestArray2.TestArray2 = new Integer[TestArray2Size];
    for (int i = 0; i < TestArray2Size; i++) {
      decodedTestArray2.TestArray2[i] = stream.readInt();
    }
    return decodedTestArray2;
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

  public static TestArray2 fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static TestArray2 fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
