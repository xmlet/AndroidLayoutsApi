package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class DialerFilter<Z extends Element> implements CustomAttributeGroup<DialerFilter<Z>, Z>, TextGroup<DialerFilter<Z>, Z>, RelativeLayoutHierarchyInterface<DialerFilter<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public DialerFilter(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDialerFilter(this);
   }

   public DialerFilter(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDialerFilter(this);
   }

   protected DialerFilter(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDialerFilter(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDialerFilter(this);
      return this.parent;
   }

   public final DialerFilter<Z> dynamic(Consumer<DialerFilter<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final DialerFilter<Z> of(Consumer<DialerFilter<Z>> consumer) {
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
      return "dialerFilter";
   }

   public final DialerFilter<Z> self() {
      return this;
   }
}
