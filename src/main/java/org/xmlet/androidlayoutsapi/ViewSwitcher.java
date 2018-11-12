package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ViewSwitcher<Z extends Element> implements CustomAttributeGroup<ViewSwitcher<Z>, Z>, TextGroup<ViewSwitcher<Z>, Z>, ViewAnimatorHierarchyInterface<ViewSwitcher<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ViewSwitcher(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementViewSwitcher(this);
   }

   public ViewSwitcher(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementViewSwitcher(this);
   }

   protected ViewSwitcher(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementViewSwitcher(this);
      }

   }

   public Z __() {
      this.visitor.visitParentViewSwitcher(this);
      return this.parent;
   }

   public final ViewSwitcher<Z> dynamic(Consumer<ViewSwitcher<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ViewSwitcher<Z> of(Consumer<ViewSwitcher<Z>> consumer) {
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
      return "viewSwitcher";
   }

   public final ViewSwitcher<Z> self() {
      return this;
   }
}
