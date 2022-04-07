// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;


import java.io.IOException;

import java.util.Arrays;

// === xdr source ============================================================

//  typedef opaque uint512[64];

//  ===========================================================================
public class Uint512 implements XdrElement {
  private byte[] uint512;

  public Uint512() {}

  public Uint512(byte[] uint512) {
    this.uint512 = uint512;
  }

  public byte[] getUint512() {
    return this.uint512;
  }

  public void setUint512(byte[] value) {
    this.uint512 = value;
  }

  public static void encode(XdrDataOutputStream stream, Uint512  encodedUint512) throws IOException {
    int uint512size = encodedUint512.uint512.length;
    stream.write(encodedUint512.getUint512(), 0, uint512size);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Uint512 decode(XdrDataInputStream stream) throws IOException {
    Uint512 decodedUint512 = new Uint512();
    int uint512size = 64;
    decodedUint512.uint512 = new byte[uint512size];
    stream.read(decodedUint512.uint512, 0, uint512size);
    return decodedUint512;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.uint512);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Uint512)) {
      return false;
    }

    Uint512 other = (Uint512) object;
    return Arrays.equals(this.uint512, other.uint512);
  }
}