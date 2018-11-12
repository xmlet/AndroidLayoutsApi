package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumScrollbarStyleView implements EnumInterface<String> {
   INSIDEINSET(String.valueOf("insideInset")),
   INSIDEOVERLAY(String.valueOf("insideOverlay")),
   OUTSIDEINSET(String.valueOf("outsideInset")),
   OUTSIDEOVERLAY(String.valueOf("outsideOverlay"));

   private final String value;

   private EnumScrollbarStyleView(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
