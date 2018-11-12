package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class RadioGroup<Z extends Element> implements CustomAttributeGroup<RadioGroup<Z>, Z>, TextGroup<RadioGroup<Z>, Z>, LinearLayoutHierarchyInterface<RadioGroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RadioGroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRadioGroup(this);
   }

   public RadioGroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRadioGroup(this);
   }

   protected RadioGroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRadioGroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRadioGroup(this);
      return this.parent;
   }

   public final RadioGroup<Z> dynamic(Consumer<RadioGroup<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RadioGroup<Z> of(Consumer<RadioGroup<Z>> consumer) {
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
      return "radioGroup";
   }

   public final RadioGroup<Z> self() {
      return this;
   }

   public final RadioGroup<Z> attrCheckedButton(String attrCheckedButton) {
      this.visitor.visitAttributeCheckedButton(attrCheckedButton);
      return this;
   }

   public final RadioGroup<Z> attrOrientation(EnumOrientationRadioGroup attrOrientation) {
      this.visitor.visitAttributeOrientation(attrOrientation.getValue());
      return this;
   }
}
