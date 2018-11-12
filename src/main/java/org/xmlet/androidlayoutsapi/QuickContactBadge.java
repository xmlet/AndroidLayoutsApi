package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class QuickContactBadge<Z extends Element> implements CustomAttributeGroup<QuickContactBadge<Z>, Z>, TextGroup<QuickContactBadge<Z>, Z>, ImageViewHierarchyInterface<QuickContactBadge<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public QuickContactBadge(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementQuickContactBadge(this);
   }

   public QuickContactBadge(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementQuickContactBadge(this);
   }

   protected QuickContactBadge(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementQuickContactBadge(this);
      }

   }

   public Z __() {
      this.visitor.visitParentQuickContactBadge(this);
      return this.parent;
   }

   public final QuickContactBadge<Z> dynamic(Consumer<QuickContactBadge<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final QuickContactBadge<Z> of(Consumer<QuickContactBadge<Z>> consumer) {
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
      return "quickContactBadge";
   }

   public final QuickContactBadge<Z> self() {
      return this;
   }
}
