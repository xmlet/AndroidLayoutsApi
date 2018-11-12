package org.xmlet.androidlayoutsapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumPersistentDrawingCacheViewGroup implements EnumInterface<String> {
   ALL(String.valueOf("all")),
   ANIMATION(String.valueOf("animation")),
   NONE(String.valueOf("none")),
   SCROLLING(String.valueOf("scrolling"));

   private final String value;

   private EnumPersistentDrawingCacheViewGroup(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
