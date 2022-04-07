// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;


import java.io.IOException;

import java.util.Arrays;

// === xdr source ============================================================

//  typedef Hash Hashes1[12];

//  ===========================================================================
public class Hashes1 implements XdrElement {
  private Hash[] Hashes1;

  public Hashes1() {}

  public Hashes1(Hash[] Hashes1) {
    this.Hashes1 = Hashes1;
  }

  public Hash[] getHashes1() {
    return this.Hashes1;
  }

  public void setHashes1(Hash[] value) {
    this.Hashes1 = value;
  }

  public static void encode(XdrDataOutputStream stream, Hashes1  encodedHashes1) throws IOException {
    int Hashes1size = encodedHashes1.getHashes1().length;
    for (int i = 0; i < Hashes1size; i++) {
      Hash.encode(stream, encodedHashes1.Hashes1[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Hashes1 decode(XdrDataInputStream stream) throws IOException {
    Hashes1 decodedHashes1 = new Hashes1();
    int Hashes1size = 12;
    decodedHashes1.Hashes1 = new Hash[Hashes1size];
    for (int i = 0; i < Hashes1size; i++) {
      decodedHashes1.Hashes1[i] = Hash.decode(stream);
    }
    return decodedHashes1;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.Hashes1);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Hashes1)) {
      return false;
    }

    Hashes1 other = (Hashes1) object;
    return Arrays.equals(this.Hashes1, other.Hashes1);
  }
}