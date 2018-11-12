package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class RSTextureView<Z extends Element> implements CustomAttributeGroup<RSTextureView<Z>, Z>, TextGroup<RSTextureView<Z>, Z>, TextureViewHierarchyInterface<RSTextureView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RSTextureView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRSTextureView(this);
   }

   public RSTextureView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRSTextureView(this);
   }

   protected RSTextureView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRSTextureView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRSTextureView(this);
      return this.parent;
   }

   public final RSTextureView<Z> dynamic(Consumer<RSTextureView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RSTextureView<Z> of(Consumer<RSTextureView<Z>> consumer) {
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
      return "rSTextureView";
   }

   public final RSTextureView<Z> self() {
      return this;
   }
}
