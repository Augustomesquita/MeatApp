import { Renderer2 } from '@angular/core';
import { ElementRef } from '@angular/core';
import { Directive } from '@angular/core';

@Directive({
  selector: '[dtvHighlight]'
})
export class HighlightDirective {

  constructor(
    private _elementRef: ElementRef,
    private _render: Renderer2
) {
    this._render.setStyle(
        this._elementRef.nativeElement,
        'background-color',
        'yellow'
    )
}

}
