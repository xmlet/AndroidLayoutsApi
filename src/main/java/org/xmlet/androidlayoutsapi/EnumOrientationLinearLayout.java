package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumOrientationLinearLayout implements EnumInterface<String> {
   HORIZONTAL(String.valueOf("horizontal")),
   VERTICAL(String.valueOf("vertical"));

   private final String value;

   private EnumOrientationLinearLayout(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
