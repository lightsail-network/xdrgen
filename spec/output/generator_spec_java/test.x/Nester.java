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
 * Nester's original definition in the XDR file is:
 * <pre>
 * struct Nester
 * {
 *   enum {
 *     BLAH_1,
 *     BLAH_2
 *   } nestedEnum;
 * 
 *   struct {
 *     int blah;
 *   } nestedStruct;
 * 
 *   union switch (Color color) {
 *     case RED:
 *       void;
 *     default:
 *       int blah2;
 *   } nestedUnion;
 * 
 * 
 * };
 * </pre>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Nester implements XdrElement {
  private NesterNestedEnum nestedEnum;
  private NesterNestedStruct nestedStruct;
  private NesterNestedUnion nestedUnion;
  public void encode(XdrDataOutputStream stream) throws IOException{
    nestedEnum.encode(stream);
    nestedStruct.encode(stream);
    nestedUnion.encode(stream);
  }
  public static Nester decode(XdrDataInputStream stream) throws IOException {
    Nester decodedNester = new Nester();
    decodedNester.nestedEnum = NesterNestedEnum.decode(stream);
    decodedNester.nestedStruct = NesterNestedStruct.decode(stream);
    decodedNester.nestedUnion = NesterNestedUnion.decode(stream);
    return decodedNester;
  }
  public static Nester fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64Factory.getInstance().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static Nester fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }

  /**
   * NesterNestedEnum's original definition in the XDR file is:
   * <pre>
   * enum {
   *     BLAH_1,
   *     BLAH_2
   *   }
   * </pre>
   */
  public static enum NesterNestedEnum implements XdrElement {
    BLAH_1(0),
    BLAH_2(1);

    private final int value;

    NestedEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static NestedEnum decode(XdrDataInputStream stream) throws IOException {
      int value = stream.readInt();
      switch (value) {
        case 0: return BLAH_1;
        case 1: return BLAH_2;
        default:
          throw new RuntimeException("Unknown enum value: " + value);
      }
    }

    public void encode(XdrDataOutputStream stream) throws IOException {
      stream.writeInt(value);
    }
    public static NestedEnum fromXdrBase64(String xdr) throws IOException {
      byte[] bytes = Base64Factory.getInstance().decode(xdr);
      return fromXdrByteArray(bytes);
    }

    public static NestedEnum fromXdrByteArray(byte[] xdr) throws IOException {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
      XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
      return decode(xdrDataInputStream);
    }

  }
  /**
   * NesterNestedStruct's original definition in the XDR file is:
   * <pre>
   * struct {
   *     int blah;
   *   }
   * </pre>
   */
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder(toBuilder = true)
  public static class NesterNestedStruct implements XdrElement {
    private Integer blah;
    public void encode(XdrDataOutputStream stream) throws IOException{
      stream.writeInt(blah);
    }
    public static NesterNestedStruct decode(XdrDataInputStream stream) throws IOException {
      NesterNestedStruct decodedNesterNestedStruct = new NesterNestedStruct();
      decodedNesterNestedStruct.blah = stream.readInt();
      return decodedNesterNestedStruct;
    }
    public static NesterNestedStruct fromXdrBase64(String xdr) throws IOException {
      byte[] bytes = Base64Factory.getInstance().decode(xdr);
      return fromXdrByteArray(bytes);
    }

    public static NesterNestedStruct fromXdrByteArray(byte[] xdr) throws IOException {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
      XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
      return decode(xdrDataInputStream);
    }

  }
  /**
   * NesterNestedUnion's original definition in the XDR file is:
   * <pre>
   * union switch (Color color) {
   *     case RED:
   *       void;
   *     default:
   *       int blah2;
   *   }
   * </pre>
   */
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder(toBuilder = true)
  public static class NesterNestedUnion implements XdrElement {
    private Color discriminant;
    private Integer blah2;

    public void encode(XdrDataOutputStream stream) throws IOException {
    stream.writeInt(discriminant.getValue());
    switch (discriminant) {
    case RED:
    break;
    default:
    stream.writeInt(blah2);
    break;
    }
    }
    public static NesterNestedUnion decode(XdrDataInputStream stream) throws IOException {
    NesterNestedUnion decodedNesterNestedUnion = new NesterNestedUnion();
    Color discriminant = Color.decode(stream);
    decodedNesterNestedUnion.setDiscriminant(discriminant);
    switch (decodedNesterNestedUnion.getDiscriminant()) {
    case RED:
    break;
    default:
    decodedNesterNestedUnion.blah2 = stream.readInt();
    break;
    }
      return decodedNesterNestedUnion;
    }
    public static NesterNestedUnion fromXdrBase64(String xdr) throws IOException {
      byte[] bytes = Base64Factory.getInstance().decode(xdr);
      return fromXdrByteArray(bytes);
    }

    public static NesterNestedUnion fromXdrByteArray(byte[] xdr) throws IOException {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
      XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
      return decode(xdrDataInputStream);
    }

  }
}
