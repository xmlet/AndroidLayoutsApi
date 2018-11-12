package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TextView<Z extends Element> implements CustomAttributeGroup<TextView<Z>, Z>, TextGroup<TextView<Z>, Z>, ViewHierarchyInterface<TextView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TextView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTextView(this);
   }

   public TextView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTextView(this);
   }

   protected TextView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTextView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTextView(this);
      return this.parent;
   }

   public final TextView<Z> dynamic(Consumer<TextView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TextView<Z> of(Consumer<TextView<Z>> consumer) {
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
      return "textView";
   }

   public final TextView<Z> self() {
      return this;
   }

   public final TextView<Z> attrAutoLink(String attrAutoLink) {
      this.visitor.visitAttributeAutoLink(attrAutoLink);
      return this;
   }

   public final TextView<Z> attrAutoText(String attrAutoText) {
      this.visitor.visitAttributeAutoText(attrAutoText);
      return this;
   }

   public final TextView<Z> attrBufferType(String attrBufferType) {
      this.visitor.visitAttributeBufferType(attrBufferType);
      return this;
   }

   public final TextView<Z> attrCapitalize(String attrCapitalize) {
      this.visitor.visitAttributeCapitalize(attrCapitalize);
      return this;
   }

   public final TextView<Z> attrCursorVisible(String attrCursorVisible) {
      this.visitor.visitAttributeCursorVisible(attrCursorVisible);
      return this;
   }

   public final TextView<Z> attrDigits(String attrDigits) {
      this.visitor.visitAttributeDigits(attrDigits);
      return this;
   }

   public final TextView<Z> attrDrawableBottom(String attrDrawableBottom) {
      this.visitor.visitAttributeDrawableBottom(attrDrawableBottom);
      return this;
   }

   public final TextView<Z> attrDrawableEnd(String attrDrawableEnd) {
      this.visitor.visitAttributeDrawableEnd(attrDrawableEnd);
      return this;
   }

   public final TextView<Z> attrDrawableLeft(String attrDrawableLeft) {
      this.visitor.visitAttributeDrawableLeft(attrDrawableLeft);
      return this;
   }

   public final TextView<Z> attrDrawablePadding(String attrDrawablePadding) {
      this.visitor.visitAttributeDrawablePadding(attrDrawablePadding);
      return this;
   }

   public final TextView<Z> attrDrawableRight(String attrDrawableRight) {
      this.visitor.visitAttributeDrawableRight(attrDrawableRight);
      return this;
   }

   public final TextView<Z> attrDrawableStart(String attrDrawableStart) {
      this.visitor.visitAttributeDrawableStart(attrDrawableStart);
      return this;
   }

   public final TextView<Z> attrDrawableTop(String attrDrawableTop) {
      this.visitor.visitAttributeDrawableTop(attrDrawableTop);
      return this;
   }

   public final TextView<Z> attrEditable(String attrEditable) {
      this.visitor.visitAttributeEditable(attrEditable);
      return this;
   }

   public final TextView<Z> attrEditorExtras(String attrEditorExtras) {
      this.visitor.visitAttributeEditorExtras(attrEditorExtras);
      return this;
   }

   public final TextView<Z> attrEllipsize(String attrEllipsize) {
      this.visitor.visitAttributeEllipsize(attrEllipsize);
      return this;
   }

   public final TextView<Z> attrEms(String attrEms) {
      this.visitor.visitAttributeEms(attrEms);
      return this;
   }

   public final TextView<Z> attrEnabled(String attrEnabled) {
      this.visitor.visitAttributeEnabled(attrEnabled);
      return this;
   }

   public final TextView<Z> attrFreezesText(String attrFreezesText) {
      this.visitor.visitAttributeFreezesText(attrFreezesText);
      return this;
   }

   public final TextView<Z> attrGravity(EnumGravityTextView attrGravity) {
      this.visitor.visitAttributeGravity(attrGravity.getValue());
      return this;
   }

   public final TextView<Z> attrHeight(String attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight);
      return this;
   }

   public final TextView<Z> attrHint(String attrHint) {
      this.visitor.visitAttributeHint(attrHint);
      return this;
   }

   public final TextView<Z> attrImeActionId(String attrImeActionId) {
      this.visitor.visitAttributeImeActionId(attrImeActionId);
      return this;
   }

   public final TextView<Z> attrImeActionLabel(String attrImeActionLabel) {
      this.visitor.visitAttributeImeActionLabel(attrImeActionLabel);
      return this;
   }

   public final TextView<Z> attrImeOptions(String attrImeOptions) {
      this.visitor.visitAttributeImeOptions(attrImeOptions);
      return this;
   }

   public final TextView<Z> attrIncludeFontPadding(String attrIncludeFontPadding) {
      this.visitor.visitAttributeIncludeFontPadding(attrIncludeFontPadding);
      return this;
   }

   public final TextView<Z> attrInputMethod(String attrInputMethod) {
      this.visitor.visitAttributeInputMethod(attrInputMethod);
      return this;
   }

   public final TextView<Z> attrInputType(String attrInputType) {
      this.visitor.visitAttributeInputType(attrInputType);
      return this;
   }

   public final TextView<Z> attrLineSpacingExtra(String attrLineSpacingExtra) {
      this.visitor.visitAttributeLineSpacingExtra(attrLineSpacingExtra);
      return this;
   }

   public final TextView<Z> attrLineSpacingMultiplier(String attrLineSpacingMultiplier) {
      this.visitor.visitAttributeLineSpacingMultiplier(attrLineSpacingMultiplier);
      return this;
   }

   public final TextView<Z> attrLines(String attrLines) {
      this.visitor.visitAttributeLines(attrLines);
      return this;
   }

   public final TextView<Z> attrLinksClickable(String attrLinksClickable) {
      this.visitor.visitAttributeLinksClickable(attrLinksClickable);
      return this;
   }

   public final TextView<Z> attrMarqueeRepeatLimit(String attrMarqueeRepeatLimit) {
      this.visitor.visitAttributeMarqueeRepeatLimit(attrMarqueeRepeatLimit);
      return this;
   }

   public final TextView<Z> attrMaxEms(String attrMaxEms) {
      this.visitor.visitAttributeMaxEms(attrMaxEms);
      return this;
   }

   public final TextView<Z> attrMaxHeight(String attrMaxHeight) {
      this.visitor.visitAttributeMaxHeight(attrMaxHeight);
      return this;
   }

   public final TextView<Z> attrMaxLength(String attrMaxLength) {
      this.visitor.visitAttributeMaxLength(attrMaxLength);
      return this;
   }

   public final TextView<Z> attrMaxLines(String attrMaxLines) {
      this.visitor.visitAttributeMaxLines(attrMaxLines);
      return this;
   }

   public final TextView<Z> attrMaxWidth(String attrMaxWidth) {
      this.visitor.visitAttributeMaxWidth(attrMaxWidth);
      return this;
   }

   public final TextView<Z> attrMinEms(String attrMinEms) {
      this.visitor.visitAttributeMinEms(attrMinEms);
      return this;
   }

   public final TextView<Z> attrMinHeight(String attrMinHeight) {
      this.visitor.visitAttributeMinHeight(attrMinHeight);
      return this;
   }

   public final TextView<Z> attrMinLines(String attrMinLines) {
      this.visitor.visitAttributeMinLines(attrMinLines);
      return this;
   }

   public final TextView<Z> attrMinWidth(String attrMinWidth) {
      this.visitor.visitAttributeMinWidth(attrMinWidth);
      return this;
   }

   public final TextView<Z> attrNumeric(String attrNumeric) {
      this.visitor.visitAttributeNumeric(attrNumeric);
      return this;
   }

   public final TextView<Z> attrPassword(String attrPassword) {
      this.visitor.visitAttributePassword(attrPassword);
      return this;
   }

   public final TextView<Z> attrPhoneNumber(String attrPhoneNumber) {
      this.visitor.visitAttributePhoneNumber(attrPhoneNumber);
      return this;
   }

   public final TextView<Z> attrPrivateImeOptions(String attrPrivateImeOptions) {
      this.visitor.visitAttributePrivateImeOptions(attrPrivateImeOptions);
      return this;
   }

   public final TextView<Z> attrScrollHorizontally(String attrScrollHorizontally) {
      this.visitor.visitAttributeScrollHorizontally(attrScrollHorizontally);
      return this;
   }

   public final TextView<Z> attrSelectAllOnFocus(String attrSelectAllOnFocus) {
      this.visitor.visitAttributeSelectAllOnFocus(attrSelectAllOnFocus);
      return this;
   }

   public final TextView<Z> attrShadowColor(String attrShadowColor) {
      this.visitor.visitAttributeShadowColor(attrShadowColor);
      return this;
   }

   public final TextView<Z> attrShadowDx(String attrShadowDx) {
      this.visitor.visitAttributeShadowDx(attrShadowDx);
      return this;
   }

   public final TextView<Z> attrShadowDy(String attrShadowDy) {
      this.visitor.visitAttributeShadowDy(attrShadowDy);
      return this;
   }

   public final TextView<Z> attrShadowRadius(String attrShadowRadius) {
      this.visitor.visitAttributeShadowRadius(attrShadowRadius);
      return this;
   }

   public final TextView<Z> attrSingleLine(String attrSingleLine) {
      this.visitor.visitAttributeSingleLine(attrSingleLine);
      return this;
   }

   public final TextView<Z> attrText(String attrText) {
      this.visitor.visitAttributeText(attrText);
      return this;
   }

   public final TextView<Z> attrTextAllCaps(String attrTextAllCaps) {
      this.visitor.visitAttributeTextAllCaps(attrTextAllCaps);
      return this;
   }

   public final TextView<Z> attrTextAppearance(String attrTextAppearance) {
      this.visitor.visitAttributeTextAppearance(attrTextAppearance);
      return this;
   }

   public final TextView<Z> attrTextColor(String attrTextColor) {
      this.visitor.visitAttributeTextColor(attrTextColor);
      return this;
   }

   public final TextView<Z> attrTextColorHighlight(String attrTextColorHighlight) {
      this.visitor.visitAttributeTextColorHighlight(attrTextColorHighlight);
      return this;
   }

   public final TextView<Z> attrTextColorHint(String attrTextColorHint) {
      this.visitor.visitAttributeTextColorHint(attrTextColorHint);
      return this;
   }

   public final TextView<Z> attrTextColorLink(String attrTextColorLink) {
      this.visitor.visitAttributeTextColorLink(attrTextColorLink);
      return this;
   }

   public final TextView<Z> attrTextCursorDrawable(String attrTextCursorDrawable) {
      this.visitor.visitAttributeTextCursorDrawable(attrTextCursorDrawable);
      return this;
   }

   public final TextView<Z> attrTextEditNoPasteWindowLayout(String attrTextEditNoPasteWindowLayout) {
      this.visitor.visitAttributeTextEditNoPasteWindowLayout(attrTextEditNoPasteWindowLayout);
      return this;
   }

   public final TextView<Z> attrTextEditPasteWindowLayout(String attrTextEditPasteWindowLayout) {
      this.visitor.visitAttributeTextEditPasteWindowLayout(attrTextEditPasteWindowLayout);
      return this;
   }

   public final TextView<Z> attrTextEditSideNoPasteWindowLayout(String attrTextEditSideNoPasteWindowLayout) {
      this.visitor.visitAttributeTextEditSideNoPasteWindowLayout(attrTextEditSideNoPasteWindowLayout);
      return this;
   }

   public final TextView<Z> attrTextEditSidePasteWindowLayout(String attrTextEditSidePasteWindowLayout) {
      this.visitor.visitAttributeTextEditSidePasteWindowLayout(attrTextEditSidePasteWindowLayout);
      return this;
   }

   public final TextView<Z> attrTextEditSuggestionItemLayout(String attrTextEditSuggestionItemLayout) {
      this.visitor.visitAttributeTextEditSuggestionItemLayout(attrTextEditSuggestionItemLayout);
      return this;
   }

   public final TextView<Z> attrTextIsSelectable(String attrTextIsSelectable) {
      this.visitor.visitAttributeTextIsSelectable(attrTextIsSelectable);
      return this;
   }

   public final TextView<Z> attrTextScaleX(String attrTextScaleX) {
      this.visitor.visitAttributeTextScaleX(attrTextScaleX);
      return this;
   }

   public final TextView<Z> attrTextSelectHandle(String attrTextSelectHandle) {
      this.visitor.visitAttributeTextSelectHandle(attrTextSelectHandle);
      return this;
   }

   public final TextView<Z> attrTextSelectHandleLeft(String attrTextSelectHandleLeft) {
      this.visitor.visitAttributeTextSelectHandleLeft(attrTextSelectHandleLeft);
      return this;
   }

   public final TextView<Z> attrTextSelectHandleRight(String attrTextSelectHandleRight) {
      this.visitor.visitAttributeTextSelectHandleRight(attrTextSelectHandleRight);
      return this;
   }

   public final TextView<Z> attrTextSize(String attrTextSize) {
      this.visitor.visitAttributeTextSize(attrTextSize);
      return this;
   }

   public final TextView<Z> attrTextStyle(String attrTextStyle) {
      this.visitor.visitAttributeTextStyle(attrTextStyle);
      return this;
   }

   public final TextView<Z> attrTypeface(String attrTypeface) {
      this.visitor.visitAttributeTypeface(attrTypeface);
      return this;
   }

   public final TextView<Z> attrWidth(String attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth);
      return this;
   }
}
