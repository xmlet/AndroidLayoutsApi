package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class ViewStub<Z extends Element> implements CustomAttributeGroup<ViewStub<Z>, Z>, TextGroup<ViewStub<Z>, Z>, ViewHierarchyInterface<ViewStub<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ViewStub(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementViewStub(this);
   }

   public ViewStub(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementViewStub(this);
   }

   protected ViewStub(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementViewStub(this);
      }

   }

   public Z __() {
      this.visitor.visitParentViewStub(this);
      return this.parent;
   }

   public final ViewStub<Z> dynamic(Consumer<ViewStub<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ViewStub<Z> of(Consumer<ViewStub<Z>> consumer) {
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
      return "viewStub";
   }

   public final ViewStub<Z> self() {
      return this;
   }

   public final ViewStub<Z> attrInflatedId(String attrInflatedId) {
      this.visitor.visitAttributeInflatedId(attrInflatedId);
      return this;
   }

   public final ViewStub<Z> attrLayout(String attrLayout) {
      this.visitor.visitAttributeLayout(attrLayout);
      return this;
   }
}
