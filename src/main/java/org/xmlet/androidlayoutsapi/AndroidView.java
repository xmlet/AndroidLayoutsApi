package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AndroidView<Z extends Element> implements CustomAttributeGroup<AndroidView<Z>, Z>, GroupAndroidViewChoice<AndroidView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AndroidView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAndroidView(this);
   }

   public AndroidView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAndroidView(this);
   }

   protected AndroidView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAndroidView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAndroidView(this);
      return this.parent;
   }

   public final AndroidView<Z> dynamic(Consumer<AndroidView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AndroidView<Z> of(Consumer<AndroidView<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "androidView";
   }

   public final AndroidView<Z> self() {
      return this;
   }
}
