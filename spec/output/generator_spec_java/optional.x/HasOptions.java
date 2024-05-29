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
import lombok.Builder;
import static MyXDR.Constants.*;

/**
 * HasOptions's original definition in the XDR file is:
 * <pre>
 * struct HasOptions
 * {
 *   int&#42; firstOption;
 *   int &#42;secondOption;
 *   Arr &#42;thirdOption;
 * };
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class HasOptions implements XdrElement {
  private Integer firstOption;
  private Integer secondOption;
  private Arr thirdOption;
  public void encode(XdrDataOutputStream stream) throws IOException{
    if (firstOption != null) {
    stream.writeInt(1);
    stream.writeInt(firstOption);
    } else {
    stream.writeInt(0);
    }
    if (secondOption != null) {
    stream.writeInt(1);
    stream.writeInt(secondOption);
    } else {
    stream.writeInt(0);
    }
    if (thirdOption != null) {
    stream.writeInt(1);
    thirdOption.encode(stream);
    } else {
    stream.writeInt(0);
    }
  }
  public static HasOptions decode(XdrDataInputStream stream) throws IOException {
    HasOptions decodedHasOptions = new HasOptions();
    int firstOptionPresent = stream.readInt();
    if (firstOptionPresent != 0) {
    decodedHasOptions.firstOption = stream.readInt();
    }
    int secondOptionPresent = stream.readInt();
    if (secondOptionPresent != 0) {
    decodedHasOptions.secondOption = stream.readInt();
    }
    int thirdOptionPresent = stream.readInt();
    if (thirdOptionPresent != 0) {
    decodedHasOptions.thirdOption = Arr.decode(stream);
    }
    return decodedHasOptions;
  }
  public static HasOptions fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static HasOptions fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
