package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class RadioButton<Z extends Element> implements CustomAttributeGroup<RadioButton<Z>, Z>, TextGroup<RadioButton<Z>, Z>, CompoundButtonHierarchyInterface<RadioButton<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RadioButton(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRadioButton(this);
   }

   public RadioButton(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRadioButton(this);
   }

   protected RadioButton(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRadioButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRadioButton(this);
      return this.parent;
   }

   public final RadioButton<Z> dynamic(Consumer<RadioButton<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RadioButton<Z> of(Consumer<RadioButton<Z>> consumer) {
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
      return "radioButton";
   }

   public final RadioButton<Z> self() {
      return this;
   }
}
