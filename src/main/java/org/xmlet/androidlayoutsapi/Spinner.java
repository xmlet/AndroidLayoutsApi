package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class Spinner<Z extends Element> implements CustomAttributeGroup<Spinner<Z>, Z>, TextGroup<Spinner<Z>, Z>, AbsSpinnerHierarchyInterface<Spinner<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Spinner(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSpinner(this);
   }

   public Spinner(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSpinner(this);
   }

   protected Spinner(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSpinner(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSpinner(this);
      return this.parent;
   }

   public final Spinner<Z> dynamic(Consumer<Spinner<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Spinner<Z> of(Consumer<Spinner<Z>> consumer) {
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
      return "spinner";
   }

   public final Spinner<Z> self() {
      return this;
   }

   public final Spinner<Z> attrDropDownHorizontalOffset(String attrDropDownHorizontalOffset) {
      this.visitor.visitAttributeDropDownHorizontalOffset(attrDropDownHorizontalOffset);
      return this;
   }

   public final Spinner<Z> attrDropDownSelector(String attrDropDownSelector) {
      this.visitor.visitAttributeDropDownSelector(attrDropDownSelector);
      return this;
   }

   public final Spinner<Z> attrDropDownVerticalOffset(String attrDropDownVerticalOffset) {
      this.visitor.visitAttributeDropDownVerticalOffset(attrDropDownVerticalOffset);
      return this;
   }

   public final Spinner<Z> attrDropDownWidth(String attrDropDownWidth) {
      this.visitor.visitAttributeDropDownWidth(attrDropDownWidth);
      return this;
   }

   public final Spinner<Z> attrGravity(EnumGravitySpinner attrGravity) {
      this.visitor.visitAttributeGravity(attrGravity.getValue());
      return this;
   }

   public final Spinner<Z> attrPopupBackground(String attrPopupBackground) {
      this.visitor.visitAttributePopupBackground(attrPopupBackground);
      return this;
   }

   public final Spinner<Z> attrPrompt(String attrPrompt) {
      this.visitor.visitAttributePrompt(attrPrompt);
      return this;
   }

   public final Spinner<Z> attrSpinnerMode(String attrSpinnerMode) {
      this.visitor.visitAttributeSpinnerMode(attrSpinnerMode);
      return this;
   }
}
