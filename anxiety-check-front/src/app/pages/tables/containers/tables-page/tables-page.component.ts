import { Component } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';

import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-tables-page',
  templateUrl: './tables-page.component.html',
  styleUrls: ['./tables-page.component.scss']
})
export class TablesPageComponent {

  result : any[];
  displayedColumns: string[] = [
    'diagnosisName',
    'therapyName',
    'therapyDesc'
  ];

  dataSource: MatTableDataSource<any>;

  constructor(private userService: UserService) {
    this.userService.getDiagnoses().subscribe(res => {
      console.log(res);
      this.dataSource = new MatTableDataSource(res);
    });
  }
}
