<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Micro Investment Platform</title>
    <style>
        /* --- STYLE SECTION --- */
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #222; 
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .phone-shell {
            width: 360px;
            height: 640px;
            background: #f1f8e9; 
            border: 12px solid #111;
            border-radius: 35px;
            overflow: hidden;
            position: relative;
            display: flex;
            flex-direction: column;
        }
        .header {
            background: #2e7d32;
            color: white;
            padding: 15px;
            text-align: center;
            font-weight: bold;
            font-size: 18px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.2);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .logout-btn {
            font-size: 10px;
            background: rgba(255,255,255,0.2);
            border: 1px solid white;
            color: white;
            padding: 2px 5px;
            border-radius: 4px;
            cursor: pointer;
            display: none; 
        }
        .screen {
            display: none; 
            flex: 1;
            padding: 20px;
            overflow-y: auto;
            flex-direction: column;
        }
        .active { display: flex; } 
        
        /* CARD STYLES */
        .card {
            background: white;
            padding: 15px;
            border-radius: 10px;
            margin-bottom: 15px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            border: 1px solid #c8e6c9;
        }
        label { font-size: 13px; font-weight: bold; color: #555; display: block; margin-top: 10px; }
        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .btn {
            width: 100%;
            padding: 12px;
            background: #2e7d32;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            margin-top: 15px;
            transition: background 0.3s;
        }
        .btn:hover { background: #1b5e20; }
        .btn-outline { background: transparent; color: #2e7d32; border: 2px solid #2e7d32; }
        .link-text { color: #666; font-size: 12px; text-decoration: underline; cursor: pointer; }

        /* Login Specifics */
        .login-box { text-align: center; margin-top: 40px; }
        .icon-lg { font-size: 50px; margin-bottom: 10px; }
        .namaste-text { font-size: 32px; color: #2e7d32; font-weight: bold; text-align: center; }

        /* History List Styles */
        .history-item {
            border-bottom: 1px solid #eee;
            padding-bottom: 10px;
            margin-bottom: 10px;
        }
        .history-date { font-size: 10px; color: #999; }
        .history-val { font-weight: bold; color: #2e7d32; float: right; }
        .empty-msg { text-align: center; color: #999; margin-top: 50px; }
    </style>
</head>
<body>

<div class="phone-shell">
    <div class="header">
        <span>Gramin Invest</span>
        <button id="top-logout" class="logout-btn" onclick="hardResetApp()">Exit</button>
    </div>

    <div id="screen-register" class="screen active">
        <div class="login-box">
            <div class="icon-lg">📝</div>
            <h2>Register</h2>
            <p style="color:#666; font-size:14px;">Create your secure account</p>
        </div>
        
        <div class="card" style="margin-top: 20px;">
            <label>Full Name:</label>
            <input type="text" id="regName" placeholder="e.g. Raju Farmer">
            
            <label>Set 4-Digit PIN:</label>
            <input type="number" id="regPin" placeholder="e.g. 5678" maxlength="4">

            <button class="btn" onclick="registerUser()">Create Account</button>
        </div>
    </div>

    <div id="screen-login" class="screen">
        <div class="login-box">
            <div class="icon-lg">🔒</div>
            <h2 id="welcome-msg">Welcome Back</h2>
            <p style="color:#666; font-size:14px;">Enter your PIN to unlock</p>
        </div>
        
        <div class="card" style="margin-top: 20px;">
            <label>Your PIN:</label>
            <input type="password" id="loginPin" placeholder="****" maxlength="4" style="text-align:center; font-size: 18px; letter-spacing: 5px;">
            <button class="btn" onclick="loginUser()">Unlock App</button>
            <p id="login-error" style="color:red; font-size:12px; text-align:center; margin-top:10px; display:none;">❌ Incorrect PIN</p>
        </div>
        <div style="text-align: center; margin-top: 20px;">
            <span class="link-text" onclick="hardResetApp()">Not you? Switch Account</span>
        </div>
    </div>

    <div id="screen-dashboard" class="screen">
        <div style="text-align: center; margin-bottom: 20px;">
            <div class="namaste-text">🙏 Namaste</div>
            <h3 id="dashboard-name" style="color:#444; margin-top:5px;">User</h3>
        </div>

        <div class="card">
            <h3>New Investment</h3>
            <p style="font-size:12px; color:#666;">Check risks and calculate returns.</p>
            <button class="btn" onclick="gotoScreen('screen-risk')">Start New Plan</button>
        </div>

        <div class="card" style="background: #e3f2fd; border-color: #bbdefb;">
            <h3>My Passbook</h3>
            <p style="font-size:12px; color:#666;">View saved investment history.</p>
            <button class="btn btn-outline" style="background:white;" onclick="showHistory()">View History</button>
        </div>
    </div>

    <div id="screen-risk" class="screen">
        <div class="card">
            <h3>Step 1: Risk Profile</h3>
            <label>Monthly Income (INR):</label>
            <input type="number" id="income" placeholder="25000">
            <label>Investment Period (Years):</label>
            <input type="number" id="period" placeholder="5">
            <button class="btn" onclick="checkRiskLogic()">Check Profile</button>
        </div>
        <div id="risk-output" style="display:none;" class="card"></div>
        <button class="btn btn-outline" onclick="gotoScreen('screen-dashboard')">Back</button>
    </div>

    <div id="screen-calc" class="screen">
        <div id="user-profile-badge" style="font-size: 12px; background: #c8e6c9; padding: 8px; border-radius: 4px; text-align: center; color: #1b5e20; font-weight: bold;">Risk: Unknown</div>
        <div class="card">
            <label>Daily Saving Amount (₹):</label>
            <input type="number" id="dailysav" placeholder="Min ₹5">
            <label>Number of Days:</label>
            <input type="number" id="days" placeholder="30">
            <label>Option:</label>
            <select id="investChoice">
                <option value="1">1. Fixed Deposits (FD) - 5%</option>
                <option value="2">2. Government Bond - 6%</option>
                <option value="3">3. Large-cap Funds - 12%</option>
                <option value="4">4. Small-cap Funds - 18%</option>
                <option value="5">5. Stocks - 12%</option>
                <option value="6">6. Index Funds - 11%</option>
                <option value="7">7. Balanced Funds - 8%</option>
                <option value="8">8. High-growth SIPs - 12%</option>
                <option value="9">9. Short-term SIPs - 7%</option>
            </select>
            <button class="btn" onclick="calculateFinal()">Invest Now</button>
        </div>
    </div>

    <div id="screen-result" class="screen">
        <div style="text-align: center; margin-top: 20px;">
            <div style="font-size: 60px;">✅</div>
            <h2>Success!</h2>
        </div>
        <div class="card" style="background: #e8f5e9; border: 2px solid #2e7d32;">
            <small>Total Saved:</small>
            <h2 id="disp-saved">₹0.00</h2>
            <hr style="border-top: 1px dashed #2e7d32;">
            <small>Final Value:</small>
            <h2 id="disp-final" style="color: #2e7d32;">₹0.00</h2>
        </div>
        <button class="btn" onclick="gotoScreen('screen-dashboard')">Go to Dashboard</button>
    </div>

    <div id="screen-history" class="screen">
        <h3>📜 Investment Passbook</h3>
        <div id="history-list" class="card">
            </div>
        <button class="btn" onclick="gotoScreen('screen-dashboard')">Back to Dashboard</button>
    </div>

</div>

<script>
    // --- 0. NAVIGATION HELPER ---
    function gotoScreen(screenId) {
        document.querySelectorAll('.screen').forEach(s => s.classList.remove('active'));
        document.getElementById(screenId).classList.add('active');
    }

    // --- 1. INITIAL LOAD CHECK ---
    document.addEventListener("DOMContentLoaded", function() {
        const savedName = localStorage.getItem("graminName");
        if (savedName) {
            // User exists, go to LOGIN screen
            document.getElementById('welcome-msg').innerText = "Welcome back, " + savedName.split(" ")[0];
            document.getElementById('dashboard-name').innerText = savedName;
            gotoScreen('screen-login');
        } else {
            // No user, go to REGISTER screen
            gotoScreen('screen-register');
        }
    });

    // --- 2. REGISTRATION ---
    function registerUser() {
        const name = document.getElementById('regName').value;
        const pin = document.getElementById('regPin').value;

        if (!name || pin.length < 4) { alert("Enter valid name and 4-digit PIN"); return; }

        localStorage.setItem("graminName", name);
        localStorage.setItem("graminPin", pin);
        localStorage.setItem("graminHistory", JSON.stringify([])); // Init empty history

        alert("Account Created! Please Login.");
        location.reload();
    }

    // --- 3. LOGIN ---
    function loginUser() {
        const enteredPin = document.getElementById('loginPin').value;
        const storedPin = localStorage.getItem("graminPin");

        if (enteredPin === storedPin) {
            document.getElementById('top-logout').style.display = 'block';
            gotoScreen('screen-dashboard');
        } else {
            document.getElementById('login-error').style.display = 'block';
        }
    }

    // --- 4. SWITCH ACCOUNT / HARD RESET (THE FIX) ---
    function hardResetApp() {
        if(confirm("Start fresh? This will clear all data for this user.")) {
             // THIS COMMAND WIPES THE MEMORY
             localStorage.clear(); 
             // THEN RELOADS THE PAGE TO SHOW REGISTER SCREEN
             location.reload(); 
        }
    }

    // --- 5. RISK LOGIC ---
    function checkRiskLogic() {
        let income = parseInt(document.getElementById('income').value);
        let period = parseInt(document.getElementById('period').value);
        if (!income || !period) { alert("Enter details"); return; }

        let riskMsg = "", suggestMsg = "";
        if (period > 3 && income > 20000) {
            riskMsg = "LOW RISK"; suggestMsg = "FD, Govt Bonds";
        } else if (period > 3 && income < 20000) {
            riskMsg = "HIGH RISK"; suggestMsg = "Small-cap, Stocks";
        } else {
            riskMsg = "MODERATE RISK"; suggestMsg = "Index Funds, SIPs";
        }

        let outputDiv = document.getElementById('risk-output');
        outputDiv.style.display = 'block';
        outputDiv.innerHTML = `
            <div style="font-weight:bold; color:#2e7d32;">${riskMsg}</div>
            <div style="font-size:12px; margin-top:5px;">${suggestMsg}</div>
            <button class="btn" style="background:#444; margin-top:10px; padding:5px;" onclick="goToCalc('${riskMsg}')">Next</button>
        `;
    }

    function goToCalc(riskLabel) {
        document.getElementById('user-profile-badge').innerText = riskLabel;
        gotoScreen('screen-calc');
    }

    // --- 6. CALCULATION & SAVING ---
    function calculateFinal() {
        let dailysav = parseInt(document.getElementById('dailysav').value);
        let days = parseInt(document.getElementById('days').value);
        let ch = parseInt(document.getElementById('investChoice').value);

        if (dailysav < 5) { alert("Min amount Rs.5"); return; }

        let totalsav = dailysav * days;
        let rates = [0, 0.05, 0.06, 0.12, 0.18, 0.12, 0.11, 0.08, 0.12, 0.07];
        let finalamt = totalsav + (totalsav * rates[ch]);

        // DISPLAY
        document.getElementById('disp-saved').innerText = "Rs. " + totalsav.toFixed(2);
        document.getElementById('disp-final').innerText = "Rs. " + finalamt.toFixed(2);

        // SAVE TO HISTORY (Local Storage)
        saveToHistory(totalsav, finalamt, ch);

        gotoScreen('screen-result');
    }

    function saveToHistory(saved, final, typeIndex) {
        let history = JSON.parse(localStorage.getItem("graminHistory")) || [];
        let typeNames = ["", "FD", "Govt Bond", "L-Cap Fund", "S-Cap Fund", "Stocks", "Index Fund", "Balanced", "High SIP", "Short SIP"];
        
        let newEntry = {
            date: new Date().toLocaleDateString(),
            type: typeNames[typeIndex],
            amt: saved,
            val: final
        };
        
        history.push(newEntry);
        localStorage.setItem("graminHistory", JSON.stringify(history));
    }

    // --- 7. SHOW HISTORY ---
    function showHistory() {
        let history = JSON.parse(localStorage.getItem("graminHistory")) || [];
        let container = document.getElementById('history-list');
        container.innerHTML = ""; // Clear current list

        if (history.length === 0) {
            container.innerHTML = "<p class='empty-msg'>No transactions found.</p>";
        } else {
            // Loop backwards to show newest first
            for (let i = history.length - 1; i >= 0; i--) {
                let item = history[i];
                container.innerHTML += `
                    <div class="history-item">
                        <div>
                            <span style="font-weight:bold;">${item.type}</span>
                            <span class="history-val">₹${item.val.toFixed(2)}</span>
                        </div>
                        <div class="history-date">
                            Saved: ₹${item.amt} | Date: ${item.date}
                        </div>
                    </div>
                `;
            }
        }
        gotoScreen('screen-history');
    }
</script>

</body>
</html>