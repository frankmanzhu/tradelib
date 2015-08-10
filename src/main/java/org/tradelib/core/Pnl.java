// Copyright 2015 by Ivan Popivanov
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.tradelib.core;

public class Pnl {
   public double realized;
   public double unrealized;
   
   public Pnl() {
      realized = 0.0;
      unrealized = 0.0;
   }
   
   public void add(double realized, double unrealized) {
      this.realized += realized;
      this.unrealized += unrealized;
   }
}
