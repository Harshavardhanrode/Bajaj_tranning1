import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CommonModule, FormsModule],
  template:`
  <div class="app-container">
    <div class="form-wrapper">
      <div class="header-section">
        <h1>Create Account</h1>
        <p>Join us today and get started</p>
      </div>

      <form (ngSubmit)="onSubmit()" #signupForm="ngForm" class="signup-form">
        <!-- First Name and Last Name Row -->
        <div class="form-row">
          <div class="form-group">
            <label for="firstName">First Name *</label>
            <input
              type="text"
              id="firstName"
              name="firstName"
              [(ngModel)]="formData.firstName"
              placeholder="John"
              required
              class="input-field"
            />
            <span class="error-text" *ngIf="submitted && !formData.firstName">First name is required</span>
          </div>

          <div class="form-group">
            <label for="lastName">Last Name *</label>
            <input
              type="text"
              id="lastName"
              name="lastName"
              [(ngModel)]="formData.lastName"
              placeholder="Doe"
              required
              class="input-field"
            />
            <span class="error-text" *ngIf="submitted && !formData.lastName">Last name is required</span>
          </div>
        </div>

        <!-- Email -->
        <div class="form-group">
          <label for="email">Email Address *</label>
          <input
            type="email"
            id="email"
            name="email"
            [(ngModel)]="formData.email"
            placeholder="john@example.com"
            required
            class="input-field"
          />
          <span class="error-text" *ngIf="submitted && !formData.email">Please enter a valid email</span>
        </div>

        <!-- Phone -->
        <div class="form-group">
          <label for="phone">Phone Number</label>
          <input
            type="tel"
            id="phone"
            name="phone"
            [(ngModel)]="formData.phone"
            placeholder="+1 (555) 000-0000"
            class="input-field"
          />
        </div>

        <!-- Password -->
        <div class="form-group">
          <label for="password">Password *</label>
          <input
            type="password"
            id="password"
            name="password"
            [(ngModel)]="formData.password"
            (input)="checkPasswordStrength()"
            placeholder="Enter your password"
            required
            class="input-field"
          />
          <div class="password-strength" *ngIf="formData.password">
            <div class="strength-bar">
              <div 
                class="strength-fill" 
                [ngClass]="'strength-' + passwordStrength"
                [style.width.%]="getPasswordStrengthPercentage()"
              ></div>
            </div>
            <span class="strength-text" [ngClass]="'text-' + passwordStrength">
              {{ getPasswordStrengthText() }}
            </span>
          </div>
          <span class="error-text" *ngIf="submitted && formData.password.length < 8">
            Password must be at least 8 characters
          </span>
        </div>

        <!-- Confirm Password -->
        <div class="form-group">
          <label for="confirmPassword">Confirm Password *</label>
          <input
            type="password"
            id="confirmPassword"
            name="confirmPassword"
            [(ngModel)]="formData.confirmPassword"
            placeholder="Re-enter your password"
            required
            class="input-field"
          />
          <span class="error-text" *ngIf="submitted && formData.password !== formData.confirmPassword">
            Passwords do not match
          </span>
        </div>

        <!-- Country -->
        <div class="form-group">
          <label for="country">Country</label>
          <select id="country" name="country" [(ngModel)]="formData.country" class="input-field">
            <option value="">Select a country</option>
            <option value="us">United States</option>
            <option value="uk">United Kingdom</option>
            <option value="in">India</option>
            <option value="ca">Canada</option>
            <option value="au">Australia</option>
            <option value="other">Other</option>
          </select>
        </div>

        <!-- Terms Checkbox -->
        <div class="checkbox-group">
          <input
            type="checkbox"
            id="terms"
            name="terms"
            [(ngModel)]="formData.acceptTerms"
            class="checkbox-input"
          />
          <label for="terms" class="checkbox-label">
            I agree to the <a href="#terms">Terms & Conditions</a> and
            <a href="#privacy">Privacy Policy</a> *
          </label>
        </div>

        <!-- Newsletter Checkbox -->
        <div class="checkbox-group">
          <input
            type="checkbox"
            id="newsletter"
            name="newsletter"
            [(ngModel)]="formData.newsletter"
            class="checkbox-input"
          />
          <label for="newsletter" class="checkbox-label">
            Subscribe to our newsletter for updates and offers
          </label>
        </div>

        <!-- Submit Button -->
        <button type="submit" class="submit-btn" [disabled]="isSubmitting">
          <span *ngIf="!isSubmitting">Create Account</span>
          <span *ngIf="isSubmitting">Creating...</span>
        </button>

        <!-- Success Message -->
        <div class="success-message" *ngIf="showSuccess" [@fadeInOut]>
          ✓ Account created successfully!
        </div>

        <!-- Login Link -->
        <div class="login-link">
          Already have an account? <a href="#login">Sign In</a>
        </div>
      </form>
    </div>
  </div>
  `,
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Harsh');
  name = 'Angular';

  submitted = false;
  isSubmitting = false;
  showSuccess = false;
  passwordStrength: 'weak' | 'medium' | 'strong' = 'weak';

  formData = {
    firstName: '',
    lastName: '',
    email: '',
    phone: '',
    password: '',
    confirmPassword: '',
    country: '',
    acceptTerms: false,
    newsletter: false
  };

  checkPasswordStrength(): void {
    const password = this.formData.password;
    let strength = 0;

    if (password.length >= 8) strength++;
    if (password.match(/[a-z]/) && password.match(/[A-Z]/)) strength++;
    if (password.match(/[0-9]/)) strength++;
    if (password.match(/[^a-zA-Z0-9]/)) strength++;

    if (strength < 2) {
      this.passwordStrength = 'weak';
    } else if (strength < 4) {
      this.passwordStrength = 'medium';
    } else {
      this.passwordStrength = 'strong';
    }
  }

  getPasswordStrengthPercentage(): number {
    const strengthMap = { weak: 33, medium: 66, strong: 100 };
    return strengthMap[this.passwordStrength];
  }

  getPasswordStrengthText(): string {
    const strengthMap = {
      weak: '🔴 Weak',
      medium: '🟠 Medium',
      strong: '🟢 Strong'
    };
    return strengthMap[this.passwordStrength];
  }

  onSubmit(): void {
    this.submitted = true;

    // Validation check
    if (
      !this.formData.firstName ||
      !this.formData.lastName ||
      !this.formData.email ||
      this.formData.password.length < 8 ||
      this.formData.password !== this.formData.confirmPassword ||
      !this.formData.acceptTerms
    ) {
      return;
    }

    this.isSubmitting = true;

    // Simulate API call
    setTimeout(() => {
      console.log('Form submitted:', this.formData);
      this.showSuccess = true;
      this.isSubmitting = false;

      // Reset form after 2 seconds
      setTimeout(() => {
        this.resetForm();
      }, 2000);
    }, 1500);
  }

  resetForm(): void {
    this.formData = {
      firstName: '',
      lastName: '',
      email: '',
      phone: '',
      password: '',
      confirmPassword: '',
      country: '',
      acceptTerms: false,
      newsletter: false
    };
    this.submitted = false;
    this.showSuccess = false;
    this.passwordStrength = 'weak';
  }
}
