package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class StackView<Z extends Element> implements CustomAttributeGroup<StackView<Z>, Z>, TextGroup<StackView<Z>, Z>, AdapterViewAnimatorHierarchyInterface<StackView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public StackView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementStackView(this);
   }

   public StackView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementStackView(this);
   }

   protected StackView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementStackView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentStackView(this);
      return this.parent;
   }

   public final StackView<Z> dynamic(Consumer<StackView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final StackView<Z> of(Consumer<StackView<Z>> consumer) {
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
      return "stackView";
   }

   public final StackView<Z> self() {
      return this;
   }
}
