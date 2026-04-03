package LEETCODE;
import  java.util.*;
public class LC_136_SINGLE_NUMBER {
    class Solution {
        public int singleNumber(int[] a) {
            if(a.length<=1) return a[0];
            if(a==null) return 0;
            HashSet<Integer> set= new HashSet<>();
            for(int n:a){
                if(set.contains(n)){
                    set.remove(n);
                }else{
                    set.add(n);
                }
            }
            return set.iterator().next();
        }
    }
}
/*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* SurePrompt
The Free Technical Prompt Community for CS Students
"Learn Better. Prompt Smarter. Share Freely."
BACKEND
Java 21 LTS
Spring Boot 3.5.13
Maven
Spring Data JPA
Thymeleaf
Spring Security
Google + GitHub OAuth2	AI FEATURES
Gemini API (user key)
OpenAI API (user key)
Claude API (user key)
Prompt Verification
Quality Scoring (1-10)
AI Improvements
Auto-tag Generation
Try This Prompt Live	ANDROID APP
Java (Android)
XML Layouts
MVVM Architecture
Retrofit2
Glide
Navigation Component
LiveData + ViewModel
No AI (Phase 1)


Free Forever  |  Open Source MIT  |  No Ads  |  No Paywalls  |  Community Owned
 
Part A — What is SurePrompt? Full Explanation
A.1  The Problem SurePrompt Solves
Every engineering and CS student uses ChatGPT, Claude, or Gemini every single day. They use it to understand DSA concepts, debug code, solve math problems, design systems, and prepare for interviews. But here is the problem — the best prompts that produce the best AI responses disappear immediately after use.
A student at VIT crafts a perfect prompt that explains Dynamic Programming with a dry run, step-by-step code, and time complexity. The AI gives an excellent response. The student shares it in a WhatsApp group of 20 friends. In 48 hours it is buried under memes. A student at NIT struggling with the exact same topic never finds it.
This is the problem SurePrompt solves. It is the permanent, searchable, social home for technical AI prompts made by students, for students.

A.2  What SurePrompt Does
SurePrompt is a web platform and Android app where CS students share, discover, and save technical AI prompts. Every post on SurePrompt has three parts — the exact prompt text the student used, the AI-generated output it produced, and metadata like topic tag, difficulty level, and which AI platform generated it.
Think of it like Instagram but only for technical prompts. You scroll a feed of prompts from people you follow and trending prompts from the whole community. You can like, save, comment, follow creators, and copy any prompt to your clipboard in one click.

A.3  The AI Features
SurePrompt has a unique AI layer built on top of the social features. Users can connect their own Gemini, OpenAI, or Claude API key in settings. Once connected, four AI features unlock:

AI Feature	What it does	Who sees the result
Prompt Verification	AI tests if the prompt actually produces a useful, relevant response. Gives a pass/fail result with a reason.	Everyone — Verified badge shown publicly on the prompt card
Quality Scoring	AI rates the prompt 1 to 10 based on clarity, specificity, structure, and usefulness. Shows a breakdown.	Everyone — Score shown on card and on the poster's profile
AI Improvement	AI rewrites the prompt to be clearer and more effective. Shows original vs improved side by side.	Only the poster — shown before they publish
Auto Tag Generation	AI reads the prompt text and suggests the correct topic tags and difficulty level automatically.	Only the poster — pre-fills the tag selector in the post form

Users without an API key can still post and use the platform normally. Their prompts show with an Unverified badge. Verified prompts rank slightly higher in the feed but all prompts are visible.

A.4  The Three Types of Users

Guest (not logged in)
•	Browse the full feed
•	Search and explore all prompts
•	Read full prompt text and AI output
•	View any user's public profile
•	Copy any prompt to clipboard
•	Cannot like, save, comment, follow, or post
Registered User
•	Everything a guest can do
•	Post prompts with AI output
•	Like, save, comment, follow
•	Connect API key for AI features
•	Create public or private collections
•	Edit and delete own posts
•	Earn badges based on activity	Admin
•	Everything a user can do
•	Access admin dashboard at /admin
•	Delete any post or comment
•	Ban or unban any user
•	Pin prompts to top of feed
•	Manage topic tags
•	View platform analytics
•	Resolve reported content
•	Send platform announcements

Android app users: Browse, search, post, like, save, comment, follow. No AI features on Android in Phase 1. All AI features are web only.


A.5  Complete Feature List
Core Features — Build These First
Feature	Where	Description
Home Feed	Web + Android	Scrollable feed of prompt cards. Three tabs: All, Following, Trending. Topic filter pills.
Post a Prompt	Web + Android	Form: title, prompt body, AI output, topic tags, difficulty, AI platform. Live preview.
Explore + Search	Web + Android	Full text search by keyword. Filter by topic, difficulty, platform, verified-only toggle.
Prompt Detail	Web + Android	Full prompt, full AI output, AI score card, like/save/copy/share/report buttons, comments.
Copy Prompt	Web + Android	One click copies exact prompt text to clipboard. No login required.
Like	Web + Android	Heart button. Count updates live via AJAX. No page reload.
Save	Web + Android	Bookmark. Saved to personal collection. Grouped by tag.
Comments	Web + Android	Threaded comments on each prompt. Add, delete own comments.
Follow	Web + Android	Follow creators. Their new posts appear in Following feed tab.
User Profile	Web + Android	Public page — avatar, college badge, stats, badges, posts grid, follow button.
Collections	Web + Android	Named folders for saved prompts. Public or private toggle.
College Badge	Web + Android	College name shown on profile and every prompt card.
Google + GitHub Login	Web + Android	One click OAuth2 login. No passwords stored.

AI Features — Build After Core Features Work
Feature	Where	Description
API Key Settings	Web only	User pastes Gemini/OpenAI/Claude key. Encrypted with AES-256. Stored in DB. Works across all logins.
Prompt Verification	Web only	Auto-runs when prompt is posted. AI tests the prompt. Saves Verified/Unverified badge to DB.
Quality Score	Web only	Runs alongside verification. AI scores 1-10. Broken down into clarity, specificity, structure, usefulness.
AI Improve Button	Web only	User clicks in post form. AI rewrites prompt. Shows diff. User accepts or ignores.
Auto Tag	Web only	Runs as user types prompt. AI suggests tags and difficulty. Pre-fills the selectors.
Try This Prompt	Web only	Button on prompt detail. Runs prompt live using user's key. Shows live AI response in modal.

Profile & Reputation Features — Phase 2
Feature	Where	Description
AI Score on Profile	Web + Android	Average AI quality score across all the user's prompts. Shown as a number on profile.
Verified Creator Badge	Web + Android	Awarded when user has 10+ prompts with AI score 8 or above.
Specialisation Badge	Web + Android	DSA Expert if 80%+ posts tagged DSA. Debugging Pro if 80%+ debugging. Auto-calculated.
Streak	Web + Android	Days in a row the user has posted. Shown as a flame streak counter on profile.
Notifications	Web + Android	Like, save, follow, comment notifications. Bell icon. Weekly digest email.
Leaderboard	Web only	Top 20 prompt creators ranked by total likes received. Filtered by topic.
Weekly Challenge	Web only	Admin posts a topic. Community posts prompts for it. Community votes. Winner pinned.

A.6  Tech Stack Summary
Layer	Tool	Version	One line reason
Language — Web	Java	21 LTS	Latest long term support. Safe until 2031. Spring Boot requires 17+.
Framework	Spring Boot	3.5.13	Latest stable GA release. Auto-configuration. Built-in Tomcat server.
Build tool	Maven	3.9.x	pom.xml. Most college Java courses teach this. Easiest for freshers.
ORM	Spring Data JPA + Hibernate	Included	Write Java classes. Hibernate auto-generates SQL. No raw SQL needed.
Frontend	Thymeleaf	3.1	Server-side HTML. No separate frontend project. Ship in 8 weeks.
Security	Spring Security	6.x	OAuth2 login, session, CSRF protection. Automatic.
Login	Google + GitHub OAuth2	Included	One click. No passwords. Students trust Google.
Database	PostgreSQL	16	Free. Enterprise grade. Full text search built in.
DB Hosting	Supabase	Free tier	Managed PostgreSQL. Visual dashboard. Zero server setup.
Backend Hosting	Railway.app	Free tier	Auto-deploys from GitHub. No server knowledge needed.
IDE — Web	IntelliJ IDEA	Community Free	Best Java IDE. Free.
Language — Android	Java	Android SDK 26+	Same language as backend. No Kotlin.
Android UI	XML Layouts	Android SDK	Traditional. Drag and drop in Android Studio.
Architecture	MVVM	Android Jetpack	Model View ViewModel. Google recommended.
API Calls	Retrofit2	2.9.0	Industry standard Android HTTP client.
Images	Glide	4.16.0	One line image loading from URL.
Navigation	Navigation Component	2.7.6	Fragment navigation. Back stack automatic.
IDE — Android	Android Studio	Latest	Google's official free Android IDE.

 
Part B — Complete File Structure
The complete file structure for both the web application and the Android application shown as a folder tree. Every file has a description of what it does on the right.

📁  Folder	[BUILD FIRST]	[AI]  AI feature	[PHASE 2]  Later	Normal file

📁 SURE-PROMPT/	Root — contains both web and Android projects

├── 📁 sureprompt-web/	Spring Boot Maven project — the website and backend API
│   ├── 📄 pom.xml [BUILD FIRST]	ALL Java dependencies. First file to edit. Add Spring Boot, JPA, Security, Thymeleaf, PostgreSQL, Lombok here.
│   ├── 📄 .env	Secret keys — DB password, Google OAuth, GitHub OAuth, AI encryption key. Never commit to GitHub.
│   ├── 📄 .gitignore	Tells Git to ignore .env, /target, .idea, *.class
│   ├── 📄 Dockerfile	Packages app into a container for Railway.app deployment
│   ├── 📄 README.md	How to run the project locally — for open source contributors

│   ├── 📁 src/	All source code lives here
│   │   ├── 📁 main/	Production code
│   │   │   ├── 📁 java/	All Java packages
│   │   │   │   ├── 📁 com/sureprompt/	Root Java package

│   │   │   │   │   ├── 📁 entity/	JPA entity classes — each class becomes a PostgreSQL table
│   │   │   │   │   │   ├── 📄 User.java [BUILD FIRST]	users table — id, username, email, college, bio, avatarUrl, role, streakCount, createdAt
│   │   │   │   │   │   ├── 📄 Prompt.java [BUILD FIRST]	prompts table — id, userId, title, promptBody, aiOutput, difficulty, platform, likeCount, saveCount, aiScore, aiVerified, pinned, deleted, createdAt
│   │   │   │   │   │   ├── 📄 Tag.java	tags table — id, name, active
│   │   │   │   │   │   ├── 📄 PromptTag.java	prompt_tags junction — promptId, tagId
│   │   │   │   │   │   ├── 📄 Like.java	likes table — userId + promptId composite PK
│   │   │   │   │   │   ├── 📄 Save.java	saves table — userId + promptId composite PK
│   │   │   │   │   │   ├── 📄 Follow.java	follows table — followerId + followingId composite PK
│   │   │   │   │   │   ├── 📄 Comment.java	comments table — id, userId, promptId, body, deleted, createdAt
│   │   │   │   │   │   ├── 📄 Collection.java	collections table — id, userId, name, isPublic, createdAt
│   │   │   │   │   │   ├── 📄 CollectionPrompt.java	collection_prompts junction — collectionId, promptId
│   │   │   │   │   │   ├── 📄 Report.java [PHASE 2]	reports table — id, reportedBy, promptId, reason, resolved
│   │   │   │   │   │   ├── 📄 Notification.java [PHASE 2]	notifications table — id, userId, type, message, read, createdAt
│   │   │   │   │   │   ├── 📄 UserApiKey.java [AI]	user_api_keys table — id, userId, provider, encryptedKey, lastUsedAt
│   │   │   │   │   │   ├── 📄 UserRole.java	Enum: USER, ADMIN
│   │   │   │   │   │   ├── 📄 AiProvider.java [AI]	Enum: GEMINI, OPENAI, CLAUDE
│   │   │   │   │   │   ├── 📄 Difficulty.java	Enum: EASY, MEDIUM, HARD

│   │   │   │   │   ├── 📁 repository/	Spring Data JPA interfaces — auto-generates SQL queries
│   │   │   │   │   │   ├── 📄 UserRepository.java [BUILD FIRST]	findByEmail(), findByUsername(), existsByUsername()
│   │   │   │   │   │   ├── 📄 PromptRepository.java [BUILD FIRST]	findFeed(), searchByKeyword(), findTrending(), findByUserId(), findVerified()
│   │   │   │   │   │   ├── 📄 TagRepository.java	findAllByActiveTrue(), findByName()
│   │   │   │   │   │   ├── 📄 PromptTagRepository.java	findTagsByPromptId(), deleteByPromptId()
│   │   │   │   │   │   ├── 📄 LikeRepository.java	existsByUserIdAndPromptId(), countByPromptId()
│   │   │   │   │   │   ├── 📄 SaveRepository.java	existsByUserIdAndPromptId(), findByUserId()
│   │   │   │   │   │   ├── 📄 FollowRepository.java	existsByFollowerAndFollowing(), findFollowers(), findFollowing()
│   │   │   │   │   │   ├── 📄 CommentRepository.java	findByPromptIdOrderByCreatedAtDesc()
│   │   │   │   │   │   ├── 📄 CollectionRepository.java	findByUserId(), findPublicCollections()
│   │   │   │   │   │   ├── 📄 ReportRepository.java [PHASE 2]	findUnresolved(), countByPromptId()
│   │   │   │   │   │   ├── 📄 NotificationRepository.java [PHASE 2]	findByUserIdAndReadFalse(), markAllRead()
│   │   │   │   │   │   ├── 📄 UserApiKeyRepository.java [AI]	findByUserIdAndProvider(), deleteByUserIdAndProvider()

│   │   │   │   │   ├── 📁 service/	Business logic — controllers call services, services call repositories
│   │   │   │   │   │   ├── 📄 PromptService.java [BUILD FIRST]	createPrompt(), editPrompt(), deletePrompt(), validateFields(), getPromptDetail()
│   │   │   │   │   │   ├── 📄 FeedService.java [BUILD FIRST]	getAllFeed(page), getFollowingFeed(userId,page), getTrendingFeed(page)
│   │   │   │   │   │   ├── 📄 SearchService.java	searchPrompts(query, tags, difficulty, platform, verifiedOnly, page)
│   │   │   │   │   │   ├── 📄 UserService.java [BUILD FIRST]	createOrUpdateOnLogin(), updateProfile(), getUserProfile(), updateStreak()
│   │   │   │   │   │   ├── 📄 LikeService.java	toggleLike(userId, promptId) — atomic, updates like_count
│   │   │   │   │   │   ├── 📄 SaveService.java	toggleSave(), getSavedByUser(), getSavedGroupedByTag()
│   │   │   │   │   │   ├── 📄 FollowService.java	toggleFollow(), getFollowers(), getFollowing()
│   │   │   │   │   │   ├── 📄 CommentService.java	addComment(), deleteComment(), getCommentsByPrompt()
│   │   │   │   │   │   ├── 📄 CollectionService.java	createCollection(), addPrompt(), removePrompt(), getPublicCollections()
│   │   │   │   │   │   ├── 📄 TagService.java	getAllActiveTags(), addTag(), renameTag(), deactivateTag()
│   │   │   │   │   │   ├── 📄 AdminService.java [PHASE 2]	getPlatformStats(), banUser(), pinPrompt(), deleteAnyPrompt()
│   │   │   │   │   │   ├── 📄 NotificationService.java [PHASE 2]	createNotification(), getUnread(), markAllRead()
│   │   │   │   │   │   ├── 📄 BadgeService.java [PHASE 2]	recalculateBadges(userId) — checks thresholds, awards badges

│   │   │   │   │   ├── 📁 service/ai/	All AI feature services — NEW section
│   │   │   │   │   │   ├── 📄 AiGatewayService.java [AI]	ONLY class that calls Gemini, OpenAI, Claude APIs. All other AI services go through this.
│   │   │   │   │   │   ├── 📄 ApiKeyService.java [AI]	saveKey(userId, provider, rawKey) — encrypts before saving. getDecryptedKey() — decrypts for use. validateKey() — tests if key works.
│   │   │   │   │   │   ├── 📄 PromptVerificationService.java [AI]	verifyPrompt(promptId, userId) — sends prompt to AI, checks response quality, saves Verified/Unverified to DB.
│   │   │   │   │   │   ├── 📄 PromptScoringService.java [AI]	scorePrompt(promptId, userId) — scores 1-10 with breakdown: clarity, specificity, structure, usefulness.
│   │   │   │   │   │   ├── 📄 PromptImprovementService.java [AI]	suggestImprovements(promptId) — AI rewrites prompt, returns original vs improved.
│   │   │   │   │   │   ├── 📄 AutoTagService.java [AI]	generateTags(promptText) — AI returns suggested tags + difficulty as JSON.
│   │   │   │   │   │   ├── 📄 AiPromptRunner.java [AI]	runPromptLive(promptId, userId) — runs prompt against AI, returns live response for Try This Prompt button.

│   │   │   │   │   ├── 📁 service/ai/model/	Java data classes for AI requests and responses
│   │   │   │   │   │   ├── 📄 AiRequest.java [AI]	provider, model, systemPrompt, userMessage, temperature
│   │   │   │   │   │   ├── 📄 AiResponse.java [AI]	content, tokensUsed, provider, success, errorMessage
│   │   │   │   │   │   ├── 📄 VerificationResult.java [AI]	passed(boolean), reason(String), aiProvider, checkedAt
│   │   │   │   │   │   ├── 📄 ScoringResult.java [AI]	totalScore, clarityScore, specificityScore, structureScore, usefulnessScore, feedback
│   │   │   │   │   │   ├── 📄 ImprovementResult.java [AI]	originalPrompt, improvedPrompt, changes(List)
│   │   │   │   │   │   ├── 📄 AutoTagResult.java [AI]	suggestedTags(List), suggestedDifficulty, confidence

│   │   │   │   │   ├── 📁 service/security/	Security utilities
│   │   │   │   │   │   ├── 📄 EncryptionService.java [AI]	encrypt(String) — AES-256. decrypt(String) — reverses. Used by ApiKeyService before DB storage.

│   │   │   │   │   ├── 📁 controller/	HTTP handlers — @Controller returns HTML, @RestController returns JSON
│   │   │   │   │   │   ├── 📄 HomeController.java [BUILD FIRST]	GET / → renders index.html (home feed)
│   │   │   │   │   │   ├── 📄 FeedController.java	GET /api/feed?tab=all|following|trending&page=0 → JSON
│   │   │   │   │   │   ├── 📄 ExploreController.java	GET /explore → HTML. GET /api/search → JSON
│   │   │   │   │   │   ├── 📄 PromptController.java [BUILD FIRST]	GET /prompts/{id}, POST /prompts/new, PUT, DELETE
│   │   │   │   │   │   ├── 📄 LikeController.java	POST /api/prompts/{id}/like → JSON {liked, likeCount}
│   │   │   │   │   │   ├── 📄 SaveController.java	POST /api/prompts/{id}/save → JSON {saved, saveCount}
│   │   │   │   │   │   ├── 📄 CommentController.java	POST and DELETE /api/prompts/{id}/comments
│   │   │   │   │   │   ├── 📄 FollowController.java	POST /api/users/{id}/follow → JSON {following, followerCount}
│   │   │   │   │   │   ├── 📄 CollectionController.java	GET POST DELETE /collections and /collections/{id}/prompts
│   │   │   │   │   │   ├── 📄 UserController.java	GET /users/{username} → renders profile.html
│   │   │   │   │   │   ├── 📄 ProfileController.java	GET /profile, PUT /api/profile
│   │   │   │   │   │   ├── 📄 SavedController.java	GET /saved → renders saved.html
│   │   │   │   │   │   ├── 📄 AuthController.java [BUILD FIRST]	GET /login, POST /logout
│   │   │   │   │   │   ├── 📄 NotificationController.java [PHASE 2]	GET /api/notifications, POST /api/notifications/read-all
│   │   │   │   │   │   ├── 📄 AdminController.java [PHASE 2]	GET POST /admin/** → admin panel. ADMIN role only.
│   │   │   │   │   │   ├── 📄 AndroidApiController.java [BUILD FIRST]	All /api/v1/** JSON endpoints called by the Android app
│   │   │   │   │   │   ├── 📄 AiController.java [AI]	POST /api/ai/verify/{id}, /api/ai/score/{id}, /api/ai/improve/{id}, /api/ai/autotag, /api/ai/run/{id}, GET /api/ai/status
│   │   │   │   │   │   ├── 📄 ApiKeyController.java [AI]	POST/DELETE/GET /settings/api-keys — save, delete, view keys. POST /validate — test key.

│   │   │   │   │   ├── 📁 dto/	Data transfer objects — clean data passed between layers
│   │   │   │   │   │   ├── 📄 PromptCardDto.java	Feed card data — title, author, college, tags, difficulty, aiScore, aiVerified, likeCount, saveCount
│   │   │   │   │   │   ├── 📄 PromptDetailDto.java	Full prompt page — adds promptBody, aiOutput, comments, verificationResult
│   │   │   │   │   │   ├── 📄 UserProfileDto.java	Public profile — username, college, bio, stats, badges, isFollowing
│   │   │   │   │   │   ├── 📄 FeedResponseDto.java	List of PromptCardDto + totalPages + currentPage
│   │   │   │   │   │   ├── 📄 SearchResponseDto.java	List of PromptCardDto + totalResults + appliedFilters
│   │   │   │   │   │   ├── 📄 CommentDto.java	id, authorName, avatarUrl, body, createdAt, isOwnComment
│   │   │   │   │   │   ├── 📄 CollectionDto.java	id, name, isPublic, promptCount, previewPrompts
│   │   │   │   │   │   ├── 📄 CreatePromptRequest.java	Post form input — title, promptBody, aiOutput, tags, difficulty, platform. @Valid.
│   │   │   │   │   │   ├── 📄 UpdateProfileRequest.java	Profile edit input — displayName, bio, college, avatarUrl
│   │   │   │   │   │   ├── 📄 ApiKeyRequest.java [AI]	provider (GEMINI/OPENAI/CLAUDE), apiKey (raw — encrypted before storage)
│   │   │   │   │   │   ├── 📄 AiStatusDto.java [AI]	hasGeminiKey, hasOpenAiKey, hasClaudeKey, activeProvider
│   │   │   │   │   │   ├── 📄 AdminStatsDto.java [PHASE 2]	totalUsers, totalPrompts, postsToday, activeReports

│   │   │   │   │   ├── 📁 security/	Spring Security + OAuth2 configuration
│   │   │   │   │   │   ├── 📄 SecurityConfig.java [BUILD FIRST]	Which URLs are public vs protected. OAuth2 config. CSRF settings.
│   │   │   │   │   │   ├── 📄 CustomOAuth2UserService.java [BUILD FIRST]	After Google/GitHub login — finds or creates User in DB
│   │   │   │   │   │   ├── 📄 CustomOAuth2User.java [BUILD FIRST]	Wraps OAuth2 user — adds userId, role, college to Security context
│   │   │   │   │   │   ├── 📄 OAuth2SuccessHandler.java	After login — new user goes to /onboarding, existing user to /feed

│   │   │   │   │   ├── 📁 config/	App configuration beans
│   │   │   │   │   │   ├── 📄 WebConfig.java	CORS — allows Android app to call /api/** endpoints
│   │   │   │   │   │   ├── 📄 AppConfig.java	@Bean definitions — ModelMapper for DTO mapping
│   │   │   │   │   │   ├── 📄 AiConfig.java [AI]	AI provider beans — Gemini, OpenAI, Claude clients. Model names, timeouts.
│   │   │   │   │   ├── 📁 exception/	Custom exceptions and global error handler
│   │   │   │   │   │   ├── 📄 PromptNotFoundException.java	Thrown when prompt ID not found → 404
│   │   │   │   │   │   ├── 📄 UserNotFoundException.java	Thrown when username not found → 404
│   │   │   │   │   │   ├── 📄 UnauthorizedException.java	Thrown when editing someone else's prompt → 403
│   │   │   │   │   │   ├── 📄 AiFeatureException.java [AI]	AI API call failed — invalid key, rate limit, network error
│   │   │   │   │   │   ├── 📄 ApiKeyNotFoundException.java [AI]	User tries AI feature but has no API key connected
│   │   │   │   │   │   ├── 📄 GlobalExceptionHandler.java	@ControllerAdvice — catches all exceptions, shows correct error page

│   │   │   ├── 📁 resources/	Non-Java files — configs, HTML templates, CSS, JavaScript
│   │   │   │   ├── 📄 application.properties [BUILD FIRST]	DB URL, server port, JPA settings, OAuth2 client IDs, AI model names, encryption key ref
│   │   │   │   ├── 📄 application-dev.properties	Local dev overrides — local DB, debug logging on
│   │   │   │   ├── 📄 application-prod.properties	Production — Railway DB URL, log level WARN

│   │   │   │   ├── 📁 templates/	Thymeleaf HTML pages — Spring Boot fills in real data from Java
│   │   │   │   │   ├── 📁 layout/	Shared fragments used by every page
│   │   │   │   │   │   ├── 📄 base.html [BUILD FIRST]	Master layout — head, CSS links, navbar, footer, JS scripts. All pages extend this.
│   │   │   │   │   │   ├── 📄 navbar.html [BUILD FIRST]	Top bar — logo, search, Post button, notification bell, avatar menu
│   │   │   │   │   │   ├── 📄 footer.html	Footer — GitHub link, open source badge
│   │   │   │   │   │   ├── 📄 prompt-card.html [BUILD FIRST]	Reusable card fragment — title, author, tags, difficulty, AI score, verified badge, buttons
│   │   │   │   │   ├── 📄 index.html [BUILD FIRST]	Home feed — All/Following/Trending tabs, topic filter pills, prompt list
│   │   │   │   │   ├── 📄 explore.html [BUILD FIRST]	Search + filters — search bar, topic chips, difficulty, platform, verified toggle
│   │   │   │   │   ├── 📄 prompt-detail.html [BUILD FIRST]	Full prompt — prompt box, AI output box, score card, comments, Try This Prompt button
│   │   │   │   │   ├── 📄 post-prompt.html [BUILD FIRST]	Create form — all fields, AI Improve button, live preview, character counters
│   │   │   │   │   ├── 📄 edit-prompt.html	Edit form — same as post but pre-filled
│   │   │   │   │   ├── 📄 profile.html [BUILD FIRST]	Public profile — avatar, stats, badges row, posts grid, follow button
│   │   │   │   │   ├── 📄 profile-edit.html	Edit own profile — name, bio, college, avatar URL
│   │   │   │   │   ├── 📄 saved.html	Saved collection — grouped by collection name
│   │   │   │   │   ├── 📄 collections.html	Browse public collections from all users
│   │   │   │   │   ├── 📄 login.html [BUILD FIRST]	Sign in — logo, Google button, GitHub button
│   │   │   │   │   ├── 📄 onboarding.html	First-time setup — college name, subject interests
│   │   │   │   │   ├── 📁 settings/
│   │   │   │   │   │   ├── 📄 ai-settings.html [AI]	AI Settings — Gemini, OpenAI, Claude sections. Paste key, Validate, Connected status, Delete.
│   │   │   │   │   │   ├── 📄 account-settings.html	Account — display name, college, email preferences
│   │   │   │   │   ├── 📁 error/
│   │   │   │   │   │   ├── 📄 404.html	Not found
│   │   │   │   │   │   ├── 📄 500.html	Server error
│   │   │   │   │   │   ├── 📄 403.html	Access denied
│   │   │   │   │   ├── 📁 admin/	Phase 2 admin panel pages
│   │   │   │   │   │   ├── 📄 dashboard.html [PHASE 2]	Stats overview — user count, posts today, active reports
│   │   │   │   │   │   ├── 📄 users.html [PHASE 2]	User list — search, ban/unban
│   │   │   │   │   │   ├── 📄 posts.html [PHASE 2]	All posts — report counts, delete, pin
│   │   │   │   │   │   ├── 📄 reports.html [PHASE 2]	Report queue
│   │   │   │   │   │   ├── 📄 tags.html [PHASE 2]	Tag management

│   │   │   │   ├── 📁 static/	CSS, JavaScript, Images — served directly by Spring Boot
│   │   │   │   │   ├── 📁 css/
│   │   │   │   │   │   ├── 📄 main.css [BUILD FIRST]	Global — typography, colors, card styles, badge styles
│   │   │   │   │   │   ├── 📄 feed.css	Feed page — card grid, tab bar, filter pills
│   │   │   │   │   │   ├── 📄 prompt.css	Prompt detail — code block, AI score card, verified badge
│   │   │   │   │   │   ├── 📄 ai.css [AI]	AI features — score ring, verified glow, improvement diff, API key status
│   │   │   │   │   │   ├── 📄 profile.css	Profile — stats row, badge grid, posts grid
│   │   │   │   │   │   ├── 📄 settings.css [AI]	AI settings page — provider cards, connection status
│   │   │   │   │   │   ├── 📄 form.css	Post form — tag chip selector, character counter, preview
│   │   │   │   │   │   ├── 📄 admin.css [PHASE 2]	Admin panel
│   │   │   │   │   ├── 📁 js/
│   │   │   │   │   │   ├── 📄 feed.js	Infinite scroll, topic filter pills, tab switching without page reload
│   │   │   │   │   │   ├── 📄 prompt.js [BUILD FIRST]	Like AJAX, Save AJAX, Copy to clipboard, Follow AJAX — all via fetch(), no page reload
│   │   │   │   │   │   ├── 📄 post.js [BUILD FIRST]	Character counter, tag multi-select, form validation, live preview update
│   │   │   │   │   │   ├── 📄 search.js	Debounced search (300ms delay), filter handlers, verified toggle
│   │   │   │   │   │   ├── 📄 ai.js [AI]	All AI JS — verify button, score animation, improve diff overlay, autotag while typing, Try This Prompt modal
│   │   │   │   │   │   ├── 📄 api-key.js [AI]	API settings — Validate button, Connected/Failed status, Delete confirmation
│   │   │   │   │   │   ├── 📄 notifications.js [PHASE 2]	Notification bell — polls for unread count, dropdown
│   │   │   │   │   │   ├── 📄 admin.js [PHASE 2]	Admin charts (Chart.js), confirm dialogs
│   │   │   │   │   ├── 📁 images/
│   │   │   │   │   │   ├── 📄 logo.svg	SurePrompt logo
│   │   │   │   │   │   ├── 📄 default-avatar.png	Fallback when user has no photo
│   │   │   │   │   │   ├── 📄 empty-feed.svg	Illustration for empty feed state
│   │   │   │   │   │   ├── 📄 verified-badge.svg [AI]	Green checkmark badge for verified prompts
│   │   │   │   │   │   ├── 📄 unverified-badge.svg [AI]	Grey badge for unverified prompts

│   │   │   │   ├── 📁 db/migration/	PostgreSQL table creation SQL scripts — run in order
│   │   │   │   │   ├── 📄 V1__create_users.sql [BUILD FIRST]	CREATE TABLE users with all columns and indexes
│   │   │   │   │   ├── 📄 V2__create_prompts.sql [BUILD FIRST]	CREATE TABLE prompts — includes aiScore, aiVerified, aiSuggestions columns
│   │   │   │   │   ├── 📄 V3__create_tags.sql	CREATE TABLE tags
│   │   │   │   │   ├── 📄 V4__create_prompt_tags.sql	CREATE TABLE prompt_tags — junction
│   │   │   │   │   ├── 📄 V5__create_likes.sql	CREATE TABLE likes — composite PK
│   │   │   │   │   ├── 📄 V6__create_saves.sql	CREATE TABLE saves — composite PK
│   │   │   │   │   ├── 📄 V7__create_follows.sql	CREATE TABLE follows — composite PK
│   │   │   │   │   ├── 📄 V8__create_comments.sql	CREATE TABLE comments
│   │   │   │   │   ├── 📄 V9__create_collections.sql	CREATE TABLE collections + collection_prompts
│   │   │   │   │   ├── 📄 V10__create_user_api_keys.sql [AI]	CREATE TABLE user_api_keys — UNIQUE on (user_id, provider)
│   │   │   │   │   ├── 📄 V11__create_notifications.sql [PHASE 2]	CREATE TABLE notifications
│   │   │   │   │   ├── 📄 V12__create_reports.sql [PHASE 2]	CREATE TABLE reports
│   │   │   │   │   ├── 📄 V13__seed_tags.sql	INSERT default tags — DSA, Debugging, Math, System Design, Interview Prep, Algorithms, DBMS, OS, Networks

│   │   ├── 📁 test/	Unit and integration tests
│   │   │   ├── 📁 java/com/sureprompt/
│   │   │   │   ├── 📁 service/	Unit tests — mock repositories, test service logic
│   │   │   │   │   ├── 📄 PromptServiceTest.java	Test create, validate, delete
│   │   │   │   │   ├── 📄 FeedServiceTest.java	Test ranking, pagination, empty following
│   │   │   │   │   ├── 📄 LikeServiceTest.java	Test toggle, duplicate prevention, count update
│   │   │   │   │   ├── 📄 AiGatewayServiceTest.java [AI]	Test AI call mocking — invalid key, rate limit, network error
│   │   │   │   │   ├── 📄 PromptVerificationServiceTest.java [AI]	Test pass/fail scenarios
│   │   │   │   │   ├── 📄 PromptScoringServiceTest.java [AI]	Test score parsing and storage
│   │   │   │   │   ├── 📄 EncryptionServiceTest.java [AI]	Test encrypt/decrypt round trip
│   │   │   │   │   ├── 📄 ApiKeyServiceTest.java [AI]	Test key save, decrypt, delete
│   │   │   │   ├── 📁 controller/	Integration tests — full HTTP cycle
│   │   │   │   │   ├── 📄 PromptControllerTest.java	POST /prompts valid → 302. Invalid → 400.
│   │   │   │   │   ├── 📄 AiControllerTest.java [AI]	POST /api/ai/verify with no key → 403. With key → runs.
│   │   │   │   │   ├── 📄 ApiKeyControllerTest.java [AI]	POST saves encrypted. DELETE removes.


├── 📁 sureprompt-android/	Android Studio project — the Android app
│   ├── 📄 build.gradle [BUILD FIRST]	Project-level — Gradle wrapper version, Hilt plugin classpath
│   ├── 📄 settings.gradle	Module name declaration
│   ├── 📄 local.properties	SDK path — auto-generated, never commit
│   ├── 📄 .gitignore	Excludes local.properties, /build, google-services.json
│   ├── 📄 README.md	How to run Android app for contributors

│   ├── 📁 app/	Main Android module
│   │   ├── 📄 build.gradle [BUILD FIRST]	App-level — minSdk 26, targetSdk 34, Java 17, all dependencies
│   │   ├── 📄 google-services.json [BUILD FIRST]	Google Sign-In config from Firebase Console. Never commit.

│   │   ├── 📁 src/main/java/com/sureprompt/	All Java source code
│   │   │   ├── 📄 SurePromptApp.java [BUILD FIRST]	Application class — @HiltAndroidApp. Called once on app start.
│   │   │   ├── 📄 MainActivity.java [BUILD FIRST]	Single Activity — NavController, BottomNavigationView, hosts all fragments

│   │   │   ├── 📁 activity/
│   │   │   │   ├── 📄 LoginActivity.java [BUILD FIRST]	Login screen — Google + GitHub sign-in buttons, app logo
│   │   │   │   ├── 📄 OnboardingActivity.java	First launch — college name, subject interests

│   │   │   ├── 📁 fragment/	One fragment per screen — all hosted in MainActivity
│   │   │   │   ├── 📄 FeedFragment.java [BUILD FIRST]	Home — ViewPager2 with All/Following/Trending tabs, filter chips
│   │   │   │   ├── 📄 AllPromptsFragment.java [BUILD FIRST]	Tab 1 — RecyclerView, infinite scroll, SwipeRefreshLayout
│   │   │   │   ├── 📄 FollowingFragment.java	Tab 2 — Feed from followed users
│   │   │   │   ├── 📄 TrendingFragment.java	Tab 3 — Top by likes+saves this week
│   │   │   │   ├── 📄 ExploreFragment.java [BUILD FIRST]	Search — SearchView, filter chips, difficulty, platform, results list
│   │   │   │   ├── 📄 PromptDetailFragment.java [BUILD FIRST]	Full prompt — ScrollView, prompt box, output box, AI score, buttons, comments
│   │   │   │   ├── 📄 PostPromptFragment.java [BUILD FIRST]	Create form — title, body, output, tags, difficulty, platform
│   │   │   │   ├── 📄 EditPromptFragment.java	Edit prompt — pre-filled form, delete button
│   │   │   │   ├── 📄 ProfileFragment.java [BUILD FIRST]	Public profile — avatar, stats, badges, posts, follow button
│   │   │   │   ├── 📄 OwnProfileFragment.java	Own profile — Edit Profile button instead of Follow
│   │   │   │   ├── 📄 EditProfileFragment.java	Edit name, bio, college, avatar URL
│   │   │   │   ├── 📄 SavedFragment.java	Saved collection — grouped by collection
│   │   │   │   ├── 📄 CollectionsFragment.java	Own + public collections
│   │   │   │   ├── 📄 CommentsBottomSheet.java	Bottom sheet — comments list + add comment input
│   │   │   │   ├── 📄 NotificationsFragment.java [PHASE 2]	Notifications list

│   │   │   ├── 📁 viewmodel/	ViewModel for each fragment — holds LiveData, survives rotation
│   │   │   │   ├── 📄 FeedViewModel.java [BUILD FIRST]	Calls PromptRepository.getFeed(). LiveData<FeedResponse>.
│   │   │   │   ├── 📄 ExploreViewModel.java	Search + filter state. LiveData<SearchResponse>.
│   │   │   │   ├── 📄 PromptDetailViewModel.java [BUILD FIRST]	Load detail, toggleLike, toggleSave, addComment. LiveData<PromptDetail>.
│   │   │   │   ├── 📄 PostPromptViewModel.java [BUILD FIRST]	Form state, validateForm(), createPrompt(). LiveData<PostResult>.
│   │   │   │   ├── 📄 ProfileViewModel.java	Load profile, toggleFollow. LiveData<UserProfile>.
│   │   │   │   ├── 📄 SavedViewModel.java	Load saved grouped by collection. unsavePrompt().
│   │   │   │   ├── 📄 LoginViewModel.java [BUILD FIRST]	Google Sign-In flow, AuthRepository.googleSignIn(), saves token.
│   │   │   │   ├── 📄 OnboardingViewModel.java	Save college + interests to backend.

│   │   │   ├── 📁 adapter/	RecyclerView adapters — connect data to XML list items
│   │   │   │   ├── 📄 PromptCardAdapter.java [BUILD FIRST]	Binds PromptCard to item_prompt_card.xml. Like/Save/Copy click handlers.
│   │   │   │   ├── 📄 CommentAdapter.java	Binds Comment to item_comment.xml
│   │   │   │   ├── 📄 TagChipAdapter.java	Binds tag names to filter chip items
│   │   │   │   ├── 📄 SavedAdapter.java	Grouped saved list adapter
│   │   │   │   ├── 📄 UserPostsAdapter.java	Profile posts grid adapter
│   │   │   │   ├── 📄 BadgeAdapter.java	Profile badges horizontal row adapter

│   │   │   ├── 📁 api/	Retrofit setup
│   │   │   │   ├── 📄 ApiClient.java [BUILD FIRST]	Retrofit.Builder — BASE_URL, GsonConverter, AuthInterceptor, LoggingInterceptor
│   │   │   │   ├── 📄 SurePromptApi.java [BUILD FIRST]	@Interface — every Spring Boot endpoint declared as annotated method
│   │   │   │   ├── 📄 AuthInterceptor.java [BUILD FIRST]	OkHttp interceptor — adds Authorization: Bearer {token} to every request

│   │   │   ├── 📁 model/	Java POJOs matching Spring Boot JSON responses
│   │   │   │   ├── 📄 PromptCard.java [BUILD FIRST]	id, title, authorName, college, tags, difficulty, platform, likeCount, saveCount, aiScore, aiVerified, isLiked, isSaved
│   │   │   │   ├── 📄 PromptDetail.java	All PromptCard + promptBody, aiOutput, comments, verificationResult
│   │   │   │   ├── 📄 UserProfile.java	userId, username, college, bio, stats, badges, isFollowing
│   │   │   │   ├── 📄 Comment.java	id, authorName, avatarUrl, body, createdAt, isOwnComment
│   │   │   │   ├── 📄 Tag.java	id, name
│   │   │   │   ├── 📄 Badge.java	id, name, iconUrl, description
│   │   │   │   ├── 📄 FeedResponse.java	List prompts, totalPages, currentPage, totalElements
│   │   │   │   ├── 📄 SearchResponse.java	List results, totalResults, appliedFilters
│   │   │   │   ├── 📄 AuthResponse.java [BUILD FIRST]	token, userId, isNewUser
│   │   │   │   ├── 📄 LikeResponse.java	liked(boolean), likeCount(int)
│   │   │   │   ├── 📄 SaveResponse.java	saved(boolean), saveCount(int)
│   │   │   │   ├── 📄 FollowResponse.java	following(boolean), followerCount(int)
│   │   │   │   ├── 📄 PostPromptRequest.java	title, promptBody, aiOutput, tags, difficulty, platform
│   │   │   │   ├── 📄 ApiError.java	error, message — from HTTP error responses

│   │   │   ├── 📁 repository/	Data access — ViewModels call repositories only, never API directly
│   │   │   │   ├── 📄 PromptRepository.java [BUILD FIRST]	getFeed(), searchPrompts(), getPromptDetail(), createPrompt(), editPrompt()
│   │   │   │   ├── 📄 LikeRepository.java	toggleLike(promptId) → LiveData<LikeResponse>
│   │   │   │   ├── 📄 SaveRepository.java	toggleSave(promptId), getSaved()
│   │   │   │   ├── 📄 UserRepository.java [BUILD FIRST]	getProfile(username), updateProfile(), followUser(), getSaved()
│   │   │   │   ├── 📄 CommentRepository.java	getComments(), addComment(), deleteComment()
│   │   │   │   ├── 📄 AuthRepository.java [BUILD FIRST]	googleSignIn(idToken), logout(), isLoggedIn(), getCurrentUserId()
│   │   │   │   ├── 📄 TagRepository.java	getAllTags() → LiveData<List<Tag>>

│   │   │   ├── 📁 local/	Local storage
│   │   │   │   ├── 📄 PreferencesManager.java [BUILD FIRST]	SharedPreferences — saveToken(), getToken(), isLoggedIn(), clearAll() on logout

│   │   │   ├── 📁 util/	Helper utilities
│   │   │   │   ├── 📄 ClipboardUtil.java [BUILD FIRST]	copyToClipboard(context, text) — Copy Prompt button
│   │   │   │   ├── 📄 DateUtil.java	formatRelative(timestamp) → '2 hours ago', '3 days ago'
│   │   │   │   ├── 📄 ValidationUtil.java	validatePromptForm() → ValidationResult with errors
│   │   │   │   ├── 📄 ShareUtil.java	createShareIntent(promptUrl) — Android share sheet
│   │   │   │   ├── 📄 NetworkUtil.java	isConnected(context) — check internet before API calls
│   │   │   │   ├── 📄 Constants.java [BUILD FIRST]	BASE_URL, TAG_LIST, DIFFICULTY_VALUES, PLATFORM_VALUES, length limits
│   │   │   │   ├── 📄 DifficultyColorUtil.java	getColor(difficulty) → green/amber/red for badge
│   │   │   │   ├── 📄 AiScoreColorUtil.java	getScoreColor(score) → color based on 1-10 for score badge

│   │   │   ├── 📁 di/	Dagger Hilt dependency injection
│   │   │   │   ├── 📄 NetworkModule.java [BUILD FIRST]	@Provides Retrofit, OkHttpClient, SurePromptApi, AuthInterceptor
│   │   │   │   ├── 📄 RepositoryModule.java	@Provides all Repository instances
│   │   │   │   ├── 📄 LocalModule.java	@Provides PreferencesManager

│   │   ├── 📁 src/main/res/	XML layouts, drawables, strings, values
│   │   │   ├── 📁 layout/	One XML file per screen and per RecyclerView item
│   │   │   │   ├── 📄 activity_login.xml [BUILD FIRST]	Login — logo, tagline, Google button, GitHub button
│   │   │   │   ├── 📄 activity_main.xml [BUILD FIRST]	Main container — FragmentContainerView + BottomNavigationView
│   │   │   │   ├── 📄 fragment_feed.xml [BUILD FIRST]	Feed — AppBarLayout, TabLayout, ViewPager2
│   │   │   │   ├── 📄 fragment_explore.xml	Explore — SearchView, chip groups, RecyclerView
│   │   │   │   ├── 📄 fragment_prompt_detail.xml [BUILD FIRST]	Prompt detail — NestedScrollView with all sections
│   │   │   │   ├── 📄 fragment_post_prompt.xml [BUILD FIRST]	Post form — all inputs, submit button
│   │   │   │   ├── 📄 fragment_profile.xml	Profile — CollapsingToolbar, stats row, ViewPager2
│   │   │   │   ├── 📄 fragment_saved.xml	Saved — grouped RecyclerView
│   │   │   │   ├── 📄 item_prompt_card.xml [BUILD FIRST]	Single prompt card — MaterialCardView, all metadata, action buttons
│   │   │   │   ├── 📄 item_comment.xml	Comment row — avatar, name, body, time
│   │   │   │   ├── 📄 item_tag_chip.xml	Filter chip
│   │   │   │   ├── 📄 item_badge.xml	Badge item — icon + name
│   │   │   │   ├── 📄 bottom_sheet_comments.xml	Comments bottom sheet
│   │   │   │   ├── 📄 dialog_confirm.xml	Generic confirm dialog
│   │   │   ├── 📁 menu/
│   │   │   │   ├── 📄 bottom_nav_menu.xml [BUILD FIRST]	Bottom nav — Feed, Explore, Post, Profile
│   │   │   │   ├── 📄 menu_profile_options.xml	Overflow — Edit Profile, Logout
│   │   │   ├── 📁 drawable/	Icons and shape backgrounds
│   │   │   │   ├── 📄 ic_launcher.xml	App icon
│   │   │   │   ├── 📄 ic_like.xml	Heart outline
│   │   │   │   ├── 📄 ic_like_filled.xml	Heart filled red
│   │   │   │   ├── 📄 ic_save.xml	Bookmark outline
│   │   │   │   ├── 📄 ic_save_filled.xml	Bookmark filled
│   │   │   │   ├── 📄 ic_copy.xml	Clipboard icon
│   │   │   │   ├── 📄 ic_share.xml	Share icon
│   │   │   │   ├── 📄 ic_verified.xml [AI]	Green checkmark for verified prompts
│   │   │   │   ├── 📄 ic_google.xml	Google logo
│   │   │   │   ├── 📄 ic_github.xml	GitHub logo
│   │   │   │   ├── 📄 bg_easy.xml	Green rounded rect — Easy badge
│   │   │   │   ├── 📄 bg_medium.xml	Amber rounded rect — Medium badge
│   │   │   │   ├── 📄 bg_hard.xml	Red rounded rect — Hard badge
│   │   │   │   ├── 📄 bg_tag_chip.xml	Tag chip background
│   │   │   │   ├── 📄 bg_ai_score.xml [AI]	Teal rounded rect — AI score badge
│   │   │   ├── 📁 values/
│   │   │   │   ├── 📄 strings.xml [BUILD FIRST]	All user-visible text strings
│   │   │   │   ├── 📄 colors.xml	Color hex values
│   │   │   │   ├── 📄 dimens.xml	Spacing and size values
│   │   │   │   ├── 📄 styles.xml [BUILD FIRST]	App theme and component styles
│   │   │   ├── 📁 navigation/
│   │   │   │   ├── 📄 nav_graph.xml [BUILD FIRST]	All fragments, transitions, arguments — Navigation Component
│   │   │   ├── 📁 font/
│   │   │   │   ├── 📄 inter_regular.ttf	Inter Regular font
│   │   │   │   ├── 📄 inter_medium.ttf	Inter Medium font

│   │   ├── 📁 src/test/	JVM unit tests
│   │   │   ├── 📄 FeedViewModelTest.java	Feed loading, tab switching, empty following
│   │   │   ├── 📄 PostPromptViewModelTest.java	Form validation — empty title, no tags
│   │   │   ├── 📄 AuthRepositoryTest.java	Token save, isLoggedIn, clearAll
│   │   ├── 📁 src/androidTest/	Instrumented UI tests
│   │   │   ├── 📄 LoginActivityTest.java	Login screen renders, buttons visible
│   │   │   ├── 📄 FeedFragmentTest.java	Feed loads, like button toggles
│   │   │   ├── 📄 CopyPromptTest.java	Copy button puts correct text in clipboard

 
Part C — Build Order and Summary
C.1  Build in This Exact Order
Week	Build this	Goal
1	Spring Boot setup + User entity + Google/GitHub OAuth login + DB connection to Supabase	Get login working. Nothing else matters until auth works.
2	Prompt entity + POST /prompts/new form + GET /prompts/{id} detail page + Thymeleaf templates	Core content. User can post and read a prompt.
3	Home feed + Explore search + topic filters + Copy Prompt button	Discovery. Now it is usable as a basic prompt library.
4	Like, Save, Comment, Follow — all AJAX no page reload	Social layer. Now it feels like a community.
5	User profiles + Collections + Saved page + College badges	Identity. Users have presence and reputation.
6	All AI services — ApiKeyService, EncryptionService, Verification, Scoring, Improvement, AutoTag, Runner	AI layer. The unique feature that makes SurePrompt different.
7	Admin dashboard + Report system + Tag management + Moderation tools	Safety. Required before public launch.
8	Android app — Auth + Feed + Explore + Prompt Detail + Like/Save/Copy	Mobile. Build Android after backend API is fully stable.
9	Android — Post Prompt + Profile + Collections + Follow + Bottom navigation	Complete Android feature parity with web.
10	Phase 2 — Badges, Leaderboard, Notifications, Weekly Challenge, Weekly digest email	Growth features after launch.

C.2  Final File Count
Project	Total files	[BUILD FIRST]	[AI] files	[PHASE 2]
Web — Java source	55	18	14	8
Web — Templates HTML	28	10	3	6
Web — Static CSS/JS/images	20	4	6	3
Web — SQL migrations	13	2	1	2
Android — Java source	52	15	0	3
Android — XML/resources	35	8	1	0
TOTAL	203 files	57 files	25 files	22 files

57 critical files first. Then 25 AI files. Then 22 Phase 2 files. That is your build plan.


so analyze the whole  text clearly and build the file structure clearly and correctly right now  make the implementation correctly  now




 */



