import { Directive, ElementRef } from '@angular/core';
import { PermissionService } from '../service/permission.service';

@Directive({
  selector: '[appCanEdit]'
})
export class CanEditDirective {
  constructor(private el: ElementRef, private permissionService: PermissionService) {
  }
  ngOnInit() {
    const permissions = this.permissionService.permissions;
    this.el.nativeElement.hidden = !(permissions.includes("appointment_edit"));
  }
} 
