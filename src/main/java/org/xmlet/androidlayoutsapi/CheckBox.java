package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class CheckBox<Z extends Element> implements CustomAttributeGroup<CheckBox<Z>, Z>, TextGroup<CheckBox<Z>, Z>, CompoundButtonHierarchyInterface<CheckBox<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CheckBox(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCheckBox(this);
   }

   public CheckBox(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCheckBox(this);
   }

   protected CheckBox(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCheckBox(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCheckBox(this);
      return this.parent;
   }

   public final CheckBox<Z> dynamic(Consumer<CheckBox<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CheckBox<Z> of(Consumer<CheckBox<Z>> consumer) {
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
      return "checkBox";
   }

   public final CheckBox<Z> self() {
      return this;
   }
}
