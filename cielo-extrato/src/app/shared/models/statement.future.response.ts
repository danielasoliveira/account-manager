export interface System {
  messages: any[];
}

export interface Transaction {
  transactionDate: Date;
  formatedTransactionDate: string;
  description: string;
  documentNumber: number;
  transactionType: string;
  formatedTransactionAmmount: string;
  transactionAmount: number;
  showDate: boolean;
  showBalanceDay: boolean;
  totalOfDay: string;
  credit: boolean;
}

export interface AccountFutureStatement {
  branch: string;
  account: string;
  accountName: string;
  generateTime: Date;
  formattedGenerateTime: string;
  totalCredit: number;
  formattedTotalCredit: string;
  totalDebit: number;
  formattedTotalDebit: string;
  transactions: Transaction[];
}

export interface AccountFutureStatementResponse {
  system: System;
  accountFutureStatement: AccountFutureStatement;
}
