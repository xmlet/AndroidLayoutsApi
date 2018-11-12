package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumScrollbarsView implements EnumInterface<String> {
   HORIZONTAL(String.valueOf("horizontal")),
   NONE(String.valueOf("none")),
   VERTICAL(String.valueOf("vertical"));

   private final String value;

   private EnumScrollbarsView(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
