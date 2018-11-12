package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class FragmentBreadCrumbs<Z extends Element> implements CustomAttributeGroup<FragmentBreadCrumbs<Z>, Z>, TextGroup<FragmentBreadCrumbs<Z>, Z>, ViewGroupHierarchyInterface<FragmentBreadCrumbs<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public FragmentBreadCrumbs(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFragmentBreadCrumbs(this);
   }

   public FragmentBreadCrumbs(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFragmentBreadCrumbs(this);
   }

   protected FragmentBreadCrumbs(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFragmentBreadCrumbs(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFragmentBreadCrumbs(this);
      return this.parent;
   }

   public final FragmentBreadCrumbs<Z> dynamic(Consumer<FragmentBreadCrumbs<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final FragmentBreadCrumbs<Z> of(Consumer<FragmentBreadCrumbs<Z>> consumer) {
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
      return "fragmentBreadCrumbs";
   }

   public final FragmentBreadCrumbs<Z> self() {
      return this;
   }
}
