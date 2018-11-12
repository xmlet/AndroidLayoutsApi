package org.xmlet.androidlayoutsapi;

public interface TextViewHierarchyInterface<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z>, TextGroup<T, Z>, ViewHierarchyInterface<T, Z> {
   default T attrAutoLink(String attrAutoLink) {
      this.getVisitor().visitAttributeAutoLink(attrAutoLink);
      return this.self();
   }

   default T attrAutoText(String attrAutoText) {
      this.getVisitor().visitAttributeAutoText(attrAutoText);
      return this.self();
   }

   default T attrBufferType(String attrBufferType) {
      this.getVisitor().visitAttributeBufferType(attrBufferType);
      return this.self();
   }

   default T attrCapitalize(String attrCapitalize) {
      this.getVisitor().visitAttributeCapitalize(attrCapitalize);
      return this.self();
   }

   default T attrCursorVisible(String attrCursorVisible) {
      this.getVisitor().visitAttributeCursorVisible(attrCursorVisible);
      return this.self();
   }

   default T attrDigits(String attrDigits) {
      this.getVisitor().visitAttributeDigits(attrDigits);
      return this.self();
   }

   default T attrDrawableBottom(String attrDrawableBottom) {
      this.getVisitor().visitAttributeDrawableBottom(attrDrawableBottom);
      return this.self();
   }

   default T attrDrawableEnd(String attrDrawableEnd) {
      this.getVisitor().visitAttributeDrawableEnd(attrDrawableEnd);
      return this.self();
   }

   default T attrDrawableLeft(String attrDrawableLeft) {
      this.getVisitor().visitAttributeDrawableLeft(attrDrawableLeft);
      return this.self();
   }

   default T attrDrawablePadding(String attrDrawablePadding) {
      this.getVisitor().visitAttributeDrawablePadding(attrDrawablePadding);
      return this.self();
   }

   default T attrDrawableRight(String attrDrawableRight) {
      this.getVisitor().visitAttributeDrawableRight(attrDrawableRight);
      return this.self();
   }

   default T attrDrawableStart(String attrDrawableStart) {
      this.getVisitor().visitAttributeDrawableStart(attrDrawableStart);
      return this.self();
   }

   default T attrDrawableTop(String attrDrawableTop) {
      this.getVisitor().visitAttributeDrawableTop(attrDrawableTop);
      return this.self();
   }

   default T attrEditable(String attrEditable) {
      this.getVisitor().visitAttributeEditable(attrEditable);
      return this.self();
   }

   default T attrEditorExtras(String attrEditorExtras) {
      this.getVisitor().visitAttributeEditorExtras(attrEditorExtras);
      return this.self();
   }

   default T attrEllipsize(String attrEllipsize) {
      this.getVisitor().visitAttributeEllipsize(attrEllipsize);
      return this.self();
   }

   default T attrEms(String attrEms) {
      this.getVisitor().visitAttributeEms(attrEms);
      return this.self();
   }

   default T attrEnabled(String attrEnabled) {
      this.getVisitor().visitAttributeEnabled(attrEnabled);
      return this.self();
   }

   default T attrFreezesText(String attrFreezesText) {
      this.getVisitor().visitAttributeFreezesText(attrFreezesText);
      return this.self();
   }

   default T attrGravity(EnumGravityTextView attrGravity) {
      this.getVisitor().visitAttributeGravity(attrGravity.getValue());
      return this.self();
   }

   default T attrHeight(String attrHeight) {
      this.getVisitor().visitAttributeHeight(attrHeight);
      return this.self();
   }

   default T attrHint(String attrHint) {
      this.getVisitor().visitAttributeHint(attrHint);
      return this.self();
   }

   default T attrImeActionId(String attrImeActionId) {
      this.getVisitor().visitAttributeImeActionId(attrImeActionId);
      return this.self();
   }

   default T attrImeActionLabel(String attrImeActionLabel) {
      this.getVisitor().visitAttributeImeActionLabel(attrImeActionLabel);
      return this.self();
   }

   default T attrImeOptions(String attrImeOptions) {
      this.getVisitor().visitAttributeImeOptions(attrImeOptions);
      return this.self();
   }

   default T attrIncludeFontPadding(String attrIncludeFontPadding) {
      this.getVisitor().visitAttributeIncludeFontPadding(attrIncludeFontPadding);
      return this.self();
   }

   default T attrInputMethod(String attrInputMethod) {
      this.getVisitor().visitAttributeInputMethod(attrInputMethod);
      return this.self();
   }

   default T attrInputType(String attrInputType) {
      this.getVisitor().visitAttributeInputType(attrInputType);
      return this.self();
   }

   default T attrLineSpacingExtra(String attrLineSpacingExtra) {
      this.getVisitor().visitAttributeLineSpacingExtra(attrLineSpacingExtra);
      return this.self();
   }

   default T attrLineSpacingMultiplier(String attrLineSpacingMultiplier) {
      this.getVisitor().visitAttributeLineSpacingMultiplier(attrLineSpacingMultiplier);
      return this.self();
   }

   default T attrLines(String attrLines) {
      this.getVisitor().visitAttributeLines(attrLines);
      return this.self();
   }

   default T attrLinksClickable(String attrLinksClickable) {
      this.getVisitor().visitAttributeLinksClickable(attrLinksClickable);
      return this.self();
   }

   default T attrMarqueeRepeatLimit(String attrMarqueeRepeatLimit) {
      this.getVisitor().visitAttributeMarqueeRepeatLimit(attrMarqueeRepeatLimit);
      return this.self();
   }

   default T attrMaxEms(String attrMaxEms) {
      this.getVisitor().visitAttributeMaxEms(attrMaxEms);
      return this.self();
   }

   default T attrMaxHeight(String attrMaxHeight) {
      this.getVisitor().visitAttributeMaxHeight(attrMaxHeight);
      return this.self();
   }

   default T attrMaxLength(String attrMaxLength) {
      this.getVisitor().visitAttributeMaxLength(attrMaxLength);
      return this.self();
   }

   default T attrMaxLines(String attrMaxLines) {
      this.getVisitor().visitAttributeMaxLines(attrMaxLines);
      return this.self();
   }

   default T attrMaxWidth(String attrMaxWidth) {
      this.getVisitor().visitAttributeMaxWidth(attrMaxWidth);
      return this.self();
   }

   default T attrMinEms(String attrMinEms) {
      this.getVisitor().visitAttributeMinEms(attrMinEms);
      return this.self();
   }

   default T attrMinHeight(String attrMinHeight) {
      this.getVisitor().visitAttributeMinHeight(attrMinHeight);
      return this.self();
   }

   default T attrMinLines(String attrMinLines) {
      this.getVisitor().visitAttributeMinLines(attrMinLines);
      return this.self();
   }

   default T attrMinWidth(String attrMinWidth) {
      this.getVisitor().visitAttributeMinWidth(attrMinWidth);
      return this.self();
   }

   default T attrNumeric(String attrNumeric) {
      this.getVisitor().visitAttributeNumeric(attrNumeric);
      return this.self();
   }

   default T attrPassword(String attrPassword) {
      this.getVisitor().visitAttributePassword(attrPassword);
      return this.self();
   }

   default T attrPhoneNumber(String attrPhoneNumber) {
      this.getVisitor().visitAttributePhoneNumber(attrPhoneNumber);
      return this.self();
   }

   default T attrPrivateImeOptions(String attrPrivateImeOptions) {
      this.getVisitor().visitAttributePrivateImeOptions(attrPrivateImeOptions);
      return this.self();
   }

   default T attrScrollHorizontally(String attrScrollHorizontally) {
      this.getVisitor().visitAttributeScrollHorizontally(attrScrollHorizontally);
      return this.self();
   }

   default T attrSelectAllOnFocus(String attrSelectAllOnFocus) {
      this.getVisitor().visitAttributeSelectAllOnFocus(attrSelectAllOnFocus);
      return this.self();
   }

   default T attrShadowColor(String attrShadowColor) {
      this.getVisitor().visitAttributeShadowColor(attrShadowColor);
      return this.self();
   }

   default T attrShadowDx(String attrShadowDx) {
      this.getVisitor().visitAttributeShadowDx(attrShadowDx);
      return this.self();
   }

   default T attrShadowDy(String attrShadowDy) {
      this.getVisitor().visitAttributeShadowDy(attrShadowDy);
      return this.self();
   }

   default T attrShadowRadius(String attrShadowRadius) {
      this.getVisitor().visitAttributeShadowRadius(attrShadowRadius);
      return this.self();
   }

   default T attrSingleLine(String attrSingleLine) {
      this.getVisitor().visitAttributeSingleLine(attrSingleLine);
      return this.self();
   }

   default T attrText(String attrText) {
      this.getVisitor().visitAttributeText(attrText);
      return this.self();
   }

   default T attrTextAllCaps(String attrTextAllCaps) {
      this.getVisitor().visitAttributeTextAllCaps(attrTextAllCaps);
      return this.self();
   }

   default T attrTextAppearance(String attrTextAppearance) {
      this.getVisitor().visitAttributeTextAppearance(attrTextAppearance);
      return this.self();
   }

   default T attrTextColor(String attrTextColor) {
      this.getVisitor().visitAttributeTextColor(attrTextColor);
      return this.self();
   }

   default T attrTextColorHighlight(String attrTextColorHighlight) {
      this.getVisitor().visitAttributeTextColorHighlight(attrTextColorHighlight);
      return this.self();
   }

   default T attrTextColorHint(String attrTextColorHint) {
      this.getVisitor().visitAttributeTextColorHint(attrTextColorHint);
      return this.self();
   }

   default T attrTextColorLink(String attrTextColorLink) {
      this.getVisitor().visitAttributeTextColorLink(attrTextColorLink);
      return this.self();
   }

   default T attrTextCursorDrawable(String attrTextCursorDrawable) {
      this.getVisitor().visitAttributeTextCursorDrawable(attrTextCursorDrawable);
      return this.self();
   }

   default T attrTextEditNoPasteWindowLayout(String attrTextEditNoPasteWindowLayout) {
      this.getVisitor().visitAttributeTextEditNoPasteWindowLayout(attrTextEditNoPasteWindowLayout);
      return this.self();
   }

   default T attrTextEditPasteWindowLayout(String attrTextEditPasteWindowLayout) {
      this.getVisitor().visitAttributeTextEditPasteWindowLayout(attrTextEditPasteWindowLayout);
      return this.self();
   }

   default T attrTextEditSideNoPasteWindowLayout(String attrTextEditSideNoPasteWindowLayout) {
      this.getVisitor().visitAttributeTextEditSideNoPasteWindowLayout(attrTextEditSideNoPasteWindowLayout);
      return this.self();
   }

   default T attrTextEditSidePasteWindowLayout(String attrTextEditSidePasteWindowLayout) {
      this.getVisitor().visitAttributeTextEditSidePasteWindowLayout(attrTextEditSidePasteWindowLayout);
      return this.self();
   }

   default T attrTextEditSuggestionItemLayout(String attrTextEditSuggestionItemLayout) {
      this.getVisitor().visitAttributeTextEditSuggestionItemLayout(attrTextEditSuggestionItemLayout);
      return this.self();
   }

   default T attrTextIsSelectable(String attrTextIsSelectable) {
      this.getVisitor().visitAttributeTextIsSelectable(attrTextIsSelectable);
      return this.self();
   }

   default T attrTextScaleX(String attrTextScaleX) {
      this.getVisitor().visitAttributeTextScaleX(attrTextScaleX);
      return this.self();
   }

   default T attrTextSelectHandle(String attrTextSelectHandle) {
      this.getVisitor().visitAttributeTextSelectHandle(attrTextSelectHandle);
      return this.self();
   }

   default T attrTextSelectHandleLeft(String attrTextSelectHandleLeft) {
      this.getVisitor().visitAttributeTextSelectHandleLeft(attrTextSelectHandleLeft);
      return this.self();
   }

   default T attrTextSelectHandleRight(String attrTextSelectHandleRight) {
      this.getVisitor().visitAttributeTextSelectHandleRight(attrTextSelectHandleRight);
      return this.self();
   }

   default T attrTextSize(String attrTextSize) {
      this.getVisitor().visitAttributeTextSize(attrTextSize);
      return this.self();
   }

   default T attrTextStyle(String attrTextStyle) {
      this.getVisitor().visitAttributeTextStyle(attrTextStyle);
      return this.self();
   }

   default T attrTypeface(String attrTypeface) {
      this.getVisitor().visitAttributeTypeface(attrTypeface);
      return this.self();
   }

   default T attrWidth(String attrWidth) {
      this.getVisitor().visitAttributeWidth(attrWidth);
      return this.self();
   }
}
