package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class KeyboardView<Z extends Element> implements CustomAttributeGroup<KeyboardView<Z>, Z>, TextGroup<KeyboardView<Z>, Z>, ViewHierarchyInterface<KeyboardView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public KeyboardView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementKeyboardView(this);
   }

   public KeyboardView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementKeyboardView(this);
   }

   protected KeyboardView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementKeyboardView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentKeyboardView(this);
      return this.parent;
   }

   public final KeyboardView<Z> dynamic(Consumer<KeyboardView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final KeyboardView<Z> of(Consumer<KeyboardView<Z>> consumer) {
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
      return "keyboardView";
   }

   public final KeyboardView<Z> self() {
      return this;
   }

   public final KeyboardView<Z> attrKeyBackground(String attrKeyBackground) {
      this.visitor.visitAttributeKeyBackground(attrKeyBackground);
      return this;
   }

   public final KeyboardView<Z> attrKeyPreviewHeight(String attrKeyPreviewHeight) {
      this.visitor.visitAttributeKeyPreviewHeight(attrKeyPreviewHeight);
      return this;
   }

   public final KeyboardView<Z> attrKeyPreviewLayout(String attrKeyPreviewLayout) {
      this.visitor.visitAttributeKeyPreviewLayout(attrKeyPreviewLayout);
      return this;
   }

   public final KeyboardView<Z> attrKeyPreviewOffset(String attrKeyPreviewOffset) {
      this.visitor.visitAttributeKeyPreviewOffset(attrKeyPreviewOffset);
      return this;
   }

   public final KeyboardView<Z> attrKeyTextColor(String attrKeyTextColor) {
      this.visitor.visitAttributeKeyTextColor(attrKeyTextColor);
      return this;
   }

   public final KeyboardView<Z> attrKeyTextSize(String attrKeyTextSize) {
      this.visitor.visitAttributeKeyTextSize(attrKeyTextSize);
      return this;
   }

   public final KeyboardView<Z> attrLabelTextSize(String attrLabelTextSize) {
      this.visitor.visitAttributeLabelTextSize(attrLabelTextSize);
      return this;
   }

   public final KeyboardView<Z> attrPopupLayout(String attrPopupLayout) {
      this.visitor.visitAttributePopupLayout(attrPopupLayout);
      return this;
   }

   public final KeyboardView<Z> attrShadowColor(String attrShadowColor) {
      this.visitor.visitAttributeShadowColor(attrShadowColor);
      return this;
   }

   public final KeyboardView<Z> attrShadowRadius(String attrShadowRadius) {
      this.visitor.visitAttributeShadowRadius(attrShadowRadius);
      return this;
   }

   public final KeyboardView<Z> attrVerticalCorrection(String attrVerticalCorrection) {
      this.visitor.visitAttributeVerticalCorrection(attrVerticalCorrection);
      return this;
   }
}
