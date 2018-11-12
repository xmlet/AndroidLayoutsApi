package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumVisibilityView implements EnumInterface<String> {
   GONE(String.valueOf("gone")),
   INVISIBLE(String.valueOf("invisible")),
   VISIBLE(String.valueOf("visible"));

   private final String value;

   private EnumVisibilityView(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
