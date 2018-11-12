package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AutoCompleteTextView<Z extends Element> implements CustomAttributeGroup<AutoCompleteTextView<Z>, Z>, TextGroup<AutoCompleteTextView<Z>, Z>, EditTextHierarchyInterface<AutoCompleteTextView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AutoCompleteTextView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAutoCompleteTextView(this);
   }

   public AutoCompleteTextView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAutoCompleteTextView(this);
   }

   protected AutoCompleteTextView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAutoCompleteTextView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAutoCompleteTextView(this);
      return this.parent;
   }

   public final AutoCompleteTextView<Z> dynamic(Consumer<AutoCompleteTextView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AutoCompleteTextView<Z> of(Consumer<AutoCompleteTextView<Z>> consumer) {
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
      return "autoCompleteTextView";
   }

   public final AutoCompleteTextView<Z> self() {
      return this;
   }

   public final AutoCompleteTextView<Z> attrCompletionHint(String attrCompletionHint) {
      this.visitor.visitAttributeCompletionHint(attrCompletionHint);
      return this;
   }

   public final AutoCompleteTextView<Z> attrCompletionHintView(String attrCompletionHintView) {
      this.visitor.visitAttributeCompletionHintView(attrCompletionHintView);
      return this;
   }

   public final AutoCompleteTextView<Z> attrCompletionThreshold(String attrCompletionThreshold) {
      this.visitor.visitAttributeCompletionThreshold(attrCompletionThreshold);
      return this;
   }

   public final AutoCompleteTextView<Z> attrDropDownAnchor(String attrDropDownAnchor) {
      this.visitor.visitAttributeDropDownAnchor(attrDropDownAnchor);
      return this;
   }

   public final AutoCompleteTextView<Z> attrDropDownHeight(String attrDropDownHeight) {
      this.visitor.visitAttributeDropDownHeight(attrDropDownHeight);
      return this;
   }

   public final AutoCompleteTextView<Z> attrDropDownHorizontalOffset(String attrDropDownHorizontalOffset) {
      this.visitor.visitAttributeDropDownHorizontalOffset(attrDropDownHorizontalOffset);
      return this;
   }

   public final AutoCompleteTextView<Z> attrDropDownSelector(String attrDropDownSelector) {
      this.visitor.visitAttributeDropDownSelector(attrDropDownSelector);
      return this;
   }

   public final AutoCompleteTextView<Z> attrDropDownVerticalOffset(String attrDropDownVerticalOffset) {
      this.visitor.visitAttributeDropDownVerticalOffset(attrDropDownVerticalOffset);
      return this;
   }

   public final AutoCompleteTextView<Z> attrDropDownWidth(String attrDropDownWidth) {
      this.visitor.visitAttributeDropDownWidth(attrDropDownWidth);
      return this;
   }

   public final AutoCompleteTextView<Z> attrInputType(String attrInputType) {
      this.visitor.visitAttributeInputType(attrInputType);
      return this;
   }
}
