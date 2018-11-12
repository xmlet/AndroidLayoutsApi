package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class Space<Z extends Element> implements CustomAttributeGroup<Space<Z>, Z>, TextGroup<Space<Z>, Z>, ViewHierarchyInterface<Space<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Space(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSpace(this);
   }

   public Space(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSpace(this);
   }

   protected Space(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSpace(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSpace(this);
      return this.parent;
   }

   public final Space<Z> dynamic(Consumer<Space<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Space<Z> of(Consumer<Space<Z>> consumer) {
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
      return "space";
   }

   public final Space<Z> self() {
      return this;
   }
}
