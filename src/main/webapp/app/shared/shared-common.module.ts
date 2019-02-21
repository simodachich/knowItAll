import { NgModule } from '@angular/core';

import { KnowItAllSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [KnowItAllSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [KnowItAllSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class KnowItAllSharedCommonModule {}
