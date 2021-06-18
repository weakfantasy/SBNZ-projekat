import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { TestResult } from 'src/app/model/test-result';
import { UserService } from 'src/app/services/user.service';
import { StressAnswers } from '../../model/stress-answers';

@Component({
  selector: 'app-test-page',
  templateUrl: './test-page.component.html',
  styleUrls: ['./test-page.component.scss']
})
export class TestPageComponent implements OnInit {

  stressAns: StressAnswers[];
  revStressAns: StressAnswers[];
  stressForm!: FormGroup;
  commonAnxietyForm : FormGroup;
  stressPoints : number;
  testResult! : TestResult;
  showAnxiety : boolean;
  showStress : boolean;
  today : Date;
  constructor(private userService : UserService) {
    this.today = new Date();
    this.showAnxiety = false;
    this.showStress = true;
    this.testResult = {};
    this.stressPoints = 0;
    this.stressAns =  [
      { value: 0, name: 'Never' },
      { value: 1, name: 'Almost Never' },
      { value: 2,name: 'Sometimes' },
      { value: 3, name: 'Fairly Often' },
      { value: 4, name: 'Very Often' },

    ];

    this.revStressAns =  [
      { value: 4, name: 'Never' },
      { value: 3, name: 'Almost Never' },
      { value: 2,name: 'Sometimes' },
      { value: 1, name: 'Fairly Often' },
      { value: 0, name: 'Very Often' },

    ];

    this.stressForm = new FormGroup({
      sympt1: new FormControl('', [Validators.required]),
      sympt2: new FormControl('', [Validators.required]),
      sympt3: new FormControl('', [Validators.required]),
      sympt4: new FormControl('', [Validators.required]),
      sympt5 : new FormControl('', [Validators.required]),
      sympt6: new FormControl('', [Validators.required]),
      sympt7: new FormControl('', [Validators.required]),
      sympt8: new FormControl('', [Validators.required]),
      sympt9: new FormControl('', [Validators.required]),
      sympt10 : new FormControl('', [Validators.required]),
  });

  this.commonAnxietyForm = new FormGroup({
    asympt1: new FormControl('', [Validators.required]),
    asympt2: new FormControl('', [Validators.required]),
    asympt3: new FormControl('', [Validators.required]),
    asympt4: new FormControl('', [Validators.required]),
    asympt5 : new FormControl('', [Validators.required]),
    asympt7: new FormControl('', [Validators.required]),
    asympt8: new FormControl('', [Validators.required]),
    asympt10 : new FormControl('', [Validators.required]),
});
  }

  ngOnInit() {
  }

  test(){
    Object.keys(this.stressForm.controls).forEach(key => {
      this.stressPoints = this.stressPoints + this.stressForm.get(key).value;
});
    this.testResult.stressPoints = this.stressPoints;
    this.showAnxiety = true;
    this.showStress = false;
    /* this.testResult.commonSympotms = [1,2,3,4,5];
    this.testResult.depressionSymptoms = [0];
    this.testResult.predominantSymptoms = [1,2,3,4,5,8,9,11,15];
    this.testResult.depressionSymptoms = [];
    this.testResult.start = "2020-12-02"; */
    console.log(this.testResult.stressPoints);
    /* this.userService.testFunction().subscribe(res => {
      console.log("Done");
    })

    this.userService.checkAnxiety(this.testResult).subscribe(res => {
      console.log("Done");
    }) */
  }

  collectAnxietySympt(){
    Object.keys(this.commonAnxietyForm.controls).forEach(key => {
      console.log(key + " " +this.commonAnxietyForm.get(key).value);
});

  }

}
