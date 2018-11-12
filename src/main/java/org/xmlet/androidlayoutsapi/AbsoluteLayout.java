package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AbsoluteLayout<Z extends Element> implements CustomAttributeGroup<AbsoluteLayout<Z>, Z>, TextGroup<AbsoluteLayout<Z>, Z>, ViewGroupHierarchyInterface<AbsoluteLayout<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AbsoluteLayout(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAbsoluteLayout(this);
   }

   public AbsoluteLayout(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAbsoluteLayout(this);
   }

   protected AbsoluteLayout(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAbsoluteLayout(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAbsoluteLayout(this);
      return this.parent;
   }

   public final AbsoluteLayout<Z> dynamic(Consumer<AbsoluteLayout<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AbsoluteLayout<Z> of(Consumer<AbsoluteLayout<Z>> consumer) {
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
      return "absoluteLayout";
   }

   public final AbsoluteLayout<Z> self() {
      return this;
   }
}
